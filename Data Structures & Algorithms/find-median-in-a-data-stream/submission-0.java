class MedianFinder {

    ArrayList<Integer> al = new ArrayList<Integer>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) { 
        int index = Collections.binarySearch(al, num); 
        if (index < 0) { 
            index = -(index + 1); // insertion point
        } 
        al.add(index, num); 
    }
    
    public double findMedian() {
        if (al.size() == 1) {
            return al.get(0);
        }

        if (al.size() % 2 == 0) {
            int mm = al.get(al.size()/2 - 1) + al.get(al.size()/2);
            return mm / 2.0;
        } else {
            return al.get(al.size()/2);
    }
    }
}
