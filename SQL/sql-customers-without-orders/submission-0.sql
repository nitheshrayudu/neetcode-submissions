SELECT c.name AS name
FROM customers c
LEFT JOIN orders o
    ON c.id = o.customer_id
WHERE o.id IS null;