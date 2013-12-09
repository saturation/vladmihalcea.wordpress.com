package org.vladmihalcea.mongo.dao;

import org.vladmihalcea.mongo.model.Product;

/**
 * ProductRepository - Product Repository
 *
 * @author Vlad Mihalcea
 */
public interface ProductCustomRepository {

    /**
     * Find and insert if not found
     * @param id id
     * @return item images
     */
    Product findAndInsert(Long id);
}