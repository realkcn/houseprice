package com.huli.houseprice.datasource;

import com.huli.houseprice.PriceResult;
import com.huli.houseprice.QueryRequest;

/**
 * Created by kcn on 2017/3/21.
 */

public interface Querier {
    PriceResult query(QueryRequest request);
}
