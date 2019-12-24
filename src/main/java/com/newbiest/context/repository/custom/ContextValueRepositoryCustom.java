package com.newbiest.context.repository.custom;

import com.newbiest.base.exception.ClientException;
import com.newbiest.context.model.Context;
import com.newbiest.context.model.ContextValue;

import java.util.List;

/**
 * Created by guoxunbo on 2018/7/6.
 */
public interface ContextValueRepositoryCustom {

    List<ContextValue> getContextValue(Context context, ContextValue contextValue) throws ClientException;
}
