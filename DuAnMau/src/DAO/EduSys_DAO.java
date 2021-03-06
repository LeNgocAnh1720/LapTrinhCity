/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author OS
 */
abstract public class EduSys_DAO<EntityType,KeyValue> {
    //KeyValue là khoá chính.
    abstract public void insert(EntityType entity);
    abstract public void update(EntityType entity);
    abstract public void delete(KeyValue id);
    abstract public EntityType SelectById(KeyValue id);
    abstract public List<EntityType> SelectAll();
    
    abstract protected List<EntityType> SelectBySQL(String sql , Object...args);
    //protected chỉ dùng cho lớp con
}
