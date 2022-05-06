package com.bookstore.springbootbookstore.service;

import com.bookstore.springbootbookstore.entity.PurchaseHistory;
import com.bookstore.springbootbookstore.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
