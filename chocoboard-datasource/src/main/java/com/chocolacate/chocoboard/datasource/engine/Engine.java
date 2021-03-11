package com.chocolacate.chocoboard.datasource.engine;

import com.chocolacate.chocoboard.entity.DataSourceType;


/**
 * Engine is used to operate the datasource, each engine belongs to a specific datasource.
 */
public interface Engine {

    /**
     *  see {@link DataSourceType}
     * @return of which Engine type
     */
    DataSourceType getEngineType();
}
