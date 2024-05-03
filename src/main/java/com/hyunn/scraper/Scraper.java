package com.hyunn.scraper;

import com.hyunn.model.Company;
import com.hyunn.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);

    ScrapedResult scrap(Company company);
}
