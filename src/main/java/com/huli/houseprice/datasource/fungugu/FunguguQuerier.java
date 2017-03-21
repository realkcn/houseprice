package com.huli.houseprice.datasource.fungugu;
/**
 * Created by kcn on 2017/3/21.
 */

import com.huli.houseprice.PriceResult;
import com.huli.houseprice.QueryRequest;
import com.huli.houseprice.datasource.Querier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@SuppressWarnings("UnusedDeclaration")
@Service("funguguquerier")
public class FunguguQuerier implements Querier {
    private static final Logger LOG = LoggerFactory.getLogger(FunguguQuerier.class);  //NOSONAR

    @Override
    public PriceResult query(QueryRequest request) {
        System.out.println("hello");
        return null;
    }
}
