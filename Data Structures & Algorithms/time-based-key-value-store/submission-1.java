class TimeMap {

    HashMap<String, String> map = new HashMap<>();


    public TimeMap() {
        
    }
    
    public void set(String key, String value, int timestamp) {
        String keyval = key +"-"+ Integer.toString(timestamp);
        map.put(keyval, value);
    }
    
    public String get(String key, int timestamp) {
        String keyvalget = key + "-" + Integer.toString(timestamp);
        if(map.containsKey(keyvalget)){
            String res[]  = map.get(keyvalget).split("-");
            return res[0];
        } else {
            return getLargestkey(map, key, timestamp);
        }
    }

    public String getLargestkey(HashMap<String, String> mappy, String key, int timestamp){
        // check the one below.
        System.out.println(timestamp);
        for(int i=timestamp-1; i >= 0; i--){
            String ss = key + "-" + i;
            System.out.print(ss);
            if(mappy.containsKey(ss)){
                return mappy.get(ss);
            }
        }
        return "";
    }
}
