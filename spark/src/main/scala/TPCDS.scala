import org.apache.spark.sql.types._

object TPCDS extends TPCBenchmark {

  override val schemaName: String = "tpcds"

  override val tablesDefs: Map[String, Array[StructField]] = Map(
    "store_sales" -> Array(
      StructField("ss_sold_date_sk", LongType, nullable = true),
      StructField("ss_sold_time_sk", LongType, nullable = true),
      StructField("ss_item_sk", LongType, nullable = false),
      StructField("ss_customer_sk", LongType, nullable = true),
      StructField("ss_cdemo_sk", LongType, nullable = true),
      StructField("ss_hdemo_sk", LongType, nullable = true),
      StructField("ss_addr_sk", LongType, nullable = true),
      StructField("ss_store_sk", LongType, nullable = true),
      StructField("ss_promo_sk", LongType, nullable = true),
      StructField("ss_ticket_number", LongType, nullable = false),
      StructField("ss_quantity", IntegerType, nullable = true),
      StructField("ss_wholesale_cost", DoubleType, nullable = true),
      StructField("ss_list_price", DoubleType, nullable = true),
      StructField("ss_sales_price", DoubleType, nullable = true),
      StructField("ss_ext_discount_amt", DoubleType, nullable = true),
      StructField("ss_ext_sales_price", DoubleType, nullable = true),
      StructField("ss_ext_wholesale_cost", DoubleType, nullable = true),
      StructField("ss_ext_list_price", DoubleType, nullable = true),
      StructField("ss_ext_tax", DoubleType, nullable = true),
      StructField("ss_coupon_amt", DoubleType, nullable = true),
      StructField("ss_net_paid", DoubleType, nullable = true),
      StructField("ss_net_paid_inc_tax", DoubleType, nullable = true),
      StructField("ss_net_profit", DoubleType, nullable = true)
    ),
    "store_returns" -> Array(
      StructField("sr_returned_date_sk", LongType, nullable = true),
      StructField("sr_return_time_sk", LongType, nullable = true),
      StructField("sr_item_sk", LongType, nullable = false),
      StructField("sr_customer_sk", LongType, nullable = true),
      StructField("sr_cdemo_sk", LongType, nullable = true),
      StructField("sr_hdemo_sk", LongType, nullable = true),
      StructField("sr_addr_sk", LongType, nullable = true),
      StructField("sr_store_sk", LongType, nullable = true),
      StructField("sr_reason_sk", LongType, nullable = true),
      StructField("sr_ticket_number", LongType, nullable = false),
      StructField("sr_return_quantity", IntegerType, nullable = true),
      StructField("sr_return_amt", DoubleType, nullable = true),
      StructField("sr_return_tax", DoubleType, nullable = true),
      StructField("sr_return_amt_inc_tax", DoubleType, nullable = true),
      StructField("sr_fee", DoubleType, nullable = true),
      StructField("sr_return_ship_cost", DoubleType, nullable = true),
      StructField("sr_refunded_cash", DoubleType, nullable = true),
      StructField("sr_reversed_charge", DoubleType, nullable = true),
      StructField("sr_store_credit", DoubleType, nullable = true),
      StructField("sr_net_loss", DoubleType, nullable = true)
    ),
    "catalog_sales" -> Array(
      StructField("cs_sold_date_sk", LongType, nullable = true),
      StructField("cs_sold_time_sk", LongType, nullable = true),
      StructField("cs_ship_date_sk", LongType, nullable = true),
      StructField("cs_bill_customer_sk", LongType, nullable = true),
      StructField("cs_bill_cdemo_sk", LongType, nullable = true),
      StructField("cs_bill_hdemo_sk", LongType, nullable = true),
      StructField("cs_bill_addr_sk", LongType, nullable = true),
      StructField("cs_ship_customer_sk", LongType, nullable = true),
      StructField("cs_ship_cdemo_sk", LongType, nullable = true),
      StructField("cs_ship_hdemo_sk", LongType, nullable = true),
      StructField("cs_ship_addr_sk", LongType, nullable = true),
      StructField("cs_call_center_sk", LongType, nullable = true),
      StructField("cs_catalog_page_sk", LongType, nullable = true),
      StructField("cs_ship_mode_sk", LongType, nullable = true),
      StructField("cs_warehouse_sk", LongType, nullable = true),
      StructField("cs_item_sk", LongType, nullable = false),
      StructField("cs_promo_sk", LongType, nullable = true),
      StructField("cs_order_number", LongType, nullable = false),
      StructField("cs_quantity", IntegerType, nullable = true),
      StructField("cs_wholesale_cost", DoubleType, nullable = true),
      StructField("cs_list_price", DoubleType, nullable = true),
      StructField("cs_sales_price", DoubleType, nullable = true),
      StructField("cs_ext_discount_amt", DoubleType, nullable = true),
      StructField("cs_ext_sales_price", DoubleType, nullable = true),
      StructField("cs_ext_wholesale_cost", DoubleType, nullable = true),
      StructField("cs_ext_list_price", DoubleType, nullable = true),
      StructField("cs_ext_tax", DoubleType, nullable = true),
      StructField("cs_coupon_amt", DoubleType, nullable = true),
      StructField("cs_ext_ship_cost", DoubleType, nullable = true),
      StructField("cs_net_paid", DoubleType, nullable = true),
      StructField("cs_net_paid_inc_tax", DoubleType, nullable = true),
      StructField("cs_net_paid_inc_ship", DoubleType, nullable = true),
      StructField("cs_net_paid_inc_ship_tax", DoubleType, nullable = true),
      StructField("cs_net_profit", DoubleType, nullable = true)
    ),
    "catalog_returns" -> Array(
      StructField("cr_returned_date_sk", LongType, nullable = true),
      StructField("cr_returned_time_sk", LongType, nullable = true),
      StructField("cr_item_sk", LongType, nullable = false),
      StructField("cr_refunded_customer_sk", LongType, nullable = true),
      StructField("cr_refunded_cdemo_sk", LongType, nullable = true),
      StructField("cr_refunded_hdemo_sk", LongType, nullable = true),
      StructField("cr_refunded_addr_sk", LongType, nullable = true),
      StructField("cr_returning_customer_sk", LongType, nullable = true),
      StructField("cr_returning_cdemo_sk", LongType, nullable = true),
      StructField("cr_returning_hdemo_sk", LongType, nullable = true),
      StructField("cr_returning_addr_sk", LongType, nullable = true),
      StructField("cr_call_center_sk", LongType, nullable = true),
      StructField("cr_catalog_page_sk", LongType, nullable = true),
      StructField("cr_ship_mode_sk", LongType, nullable = true),
      StructField("cr_warehouse_sk", LongType, nullable = true),
      StructField("cr_reason_sk", LongType, nullable = true),
      StructField("cr_order_number", LongType, nullable = false),
      StructField("cr_return_quantity", IntegerType, nullable = true),
      StructField("cr_return_amount", DoubleType, nullable = true),
      StructField("cr_return_tax", DoubleType, nullable = true),
      StructField("cr_return_amt_inc_tax", DoubleType, nullable = true),
      StructField("cr_fee", DoubleType, nullable = true),
      StructField("cr_return_ship_cost", DoubleType, nullable = true),
      StructField("cr_refunded_cash", DoubleType, nullable = true),
      StructField("cr_reversed_charge", DoubleType, nullable = true),
      StructField("cr_store_credit", DoubleType, nullable = true),
      StructField("cr_net_loss", DoubleType, nullable = true)
    ),
    "web_sales" -> Array(
      StructField("ws_sold_date_sk", LongType, nullable = true),
      StructField("ws_sold_time_sk", LongType, nullable = true),
      StructField("ws_ship_date_sk", LongType, nullable = true),
      StructField("ws_item_sk", LongType, nullable = false),
      StructField("ws_bill_customer_sk", LongType, nullable = true),
      StructField("ws_bill_cdemo_sk", LongType, nullable = true),
      StructField("ws_bill_hdemo_sk", LongType, nullable = true),
      StructField("ws_bill_addr_sk", LongType, nullable = true),
      StructField("ws_ship_customer_sk", LongType, nullable = true),
      StructField("ws_ship_cdemo_sk", LongType, nullable = true),
      StructField("ws_ship_hdemo_sk", LongType, nullable = true),
      StructField("ws_ship_addr_sk", LongType, nullable = true),
      StructField("ws_web_page_sk", LongType, nullable = true),
      StructField("ws_web_site_sk", LongType, nullable = true),
      StructField("ws_ship_mode_sk", LongType, nullable = true),
      StructField("ws_warehouse_sk", LongType, nullable = true),
      StructField("ws_promo_sk", LongType, nullable = true),
      StructField("ws_order_number", LongType, nullable = false),
      StructField("ws_quantity", IntegerType, nullable = true),
      StructField("ws_wholesale_cost", DoubleType, nullable = true),
      StructField("ws_list_price", DoubleType, nullable = true),
      StructField("ws_sales_price", DoubleType, nullable = true),
      StructField("ws_ext_discount_amt", DoubleType, nullable = true),
      StructField("ws_ext_sales_price", DoubleType, nullable = true),
      StructField("ws_ext_wholesale_cost", DoubleType, nullable = true),
      StructField("ws_ext_list_price", DoubleType, nullable = true),
      StructField("ws_ext_tax", DoubleType, nullable = true),
      StructField("ws_coupon_amt", DoubleType, nullable = true),
      StructField("ws_ext_ship_cost", DoubleType, nullable = true),
      StructField("ws_net_paid", DoubleType, nullable = true),
      StructField("ws_net_paid_inc_tax", DoubleType, nullable = true),
      StructField("ws_net_paid_inc_ship", DoubleType, nullable = true),
      StructField("ws_net_paid_inc_ship_tax", DoubleType, nullable = true),
      StructField("ws_net_profit", DoubleType, nullable = true)
    ),
    "web_returns" -> Array(
      StructField("wr_returned_date_sk", LongType, nullable = true),
      StructField("wr_return_time_sk", LongType, nullable = true),
      StructField("wr_item_sk", LongType, nullable = false),
      StructField("wr_refunded_customer_sk", LongType, nullable = true),
      StructField("wr_refunded_cdemo_sk", LongType, nullable = true),
      StructField("wr_refunded_hdemo_sk", LongType, nullable = true),
      StructField("wr_refunded_addr_sk", LongType, nullable = true),
      StructField("wr_returning_customer_sk", LongType, nullable = true),
      StructField("wr_returning_cdemo_sk", LongType, nullable = true),
      StructField("wr_returning_hdemo_sk", LongType, nullable = true),
      StructField("wr_returning_addr_sk", LongType, nullable = true),
      StructField("wr_web_page_sk", LongType, nullable = true),
      StructField("wr_reason_sk", LongType, nullable = true),
      StructField("wr_order_number", LongType, nullable = false),
      StructField("wr_return_quantity", IntegerType, nullable = true),
      StructField("wr_return_amt", DoubleType, nullable = true),
      StructField("wr_return_tax", DoubleType, nullable = true),
      StructField("wr_return_amt_inc_tax", DoubleType, nullable = true),
      StructField("wr_fee", DoubleType, nullable = true),
      StructField("wr_return_ship_cost", DoubleType, nullable = true),
      StructField("wr_refunded_cash", DoubleType, nullable = true),
      StructField("wr_reversed_charge", DoubleType, nullable = true),
      StructField("wr_account_credit", DoubleType, nullable = true),
      StructField("wr_net_loss", DoubleType, nullable = true)
    ),
    "inventory" -> Array(
      StructField("inv_date_sk", LongType, nullable = false),
      StructField("inv_item_sk", LongType, nullable = false),
      StructField("inv_warehouse_sk", LongType, nullable = false),
      StructField("inv_quantity_on_hand", IntegerType, nullable = true)
    ),
    "store" -> Array(
      StructField("s_store_sk", LongType, nullable = false),
      StructField("s_store_id", StringType, nullable = false),        // 16
      StructField("s_rec_start_date", DateType, nullable = true),
      StructField("s_rec_end_date", DateType, nullable = true),
      StructField("s_closed_date_sk", LongType, nullable = true),
      StructField("s_store_name", StringType, nullable = true),       // 50
      StructField("s_number_employees", IntegerType, nullable = true),
      StructField("s_floor_space", IntegerType, nullable = true),
      StructField("s_hours", StringType, nullable = true),            // 20
      StructField("S_manager", StringType, nullable = true),          // 40
      StructField("S_market_id", IntegerType, nullable = true),
      StructField("S_geography_class", StringType, nullable = true),  // 100
      StructField("S_market_desc", StringType, nullable = true),      // 100
      StructField("s_market_manager", StringType, nullable = true),   // 40
      StructField("s_division_id", IntegerType, nullable = true),
      StructField("s_division_name", StringType, nullable = true),    // 50
      StructField("s_company_id", IntegerType, nullable = true),
      StructField("s_company_name", StringType, nullable = true),     // 50
      StructField("s_street_number", StringType, nullable = true),    // 10
      StructField("s_street_name", StringType, nullable = true),      // 60
      StructField("s_street_type", StringType, nullable = true),      // 15
      StructField("s_suite_number", StringType, nullable = true),     // 10
      StructField("s_city", StringType, nullable = true),             // 60
      StructField("s_county", StringType, nullable = true),           // 30
      StructField("s_state", StringType, nullable = true),            // 2
      StructField("s_zip", StringType, nullable = true),              // 10
      StructField("s_country", StringType, nullable = true),          // 20
      StructField("s_gmt_offset", DoubleType, nullable = true),
      StructField("s_tax_percentage", DoubleType, nullable = true)
    ),
    "call_center" -> Array(
      StructField("cc_call_center_sk", LongType, nullable = false),
      StructField("cc_call_center_id", StringType, nullable = false),   // 16
      StructField("cc_rec_start_date", DateType, nullable = true),
      StructField("cc_rec_end_date", DateType, nullable = true),
      StructField("cc_closed_date_sk", LongType, nullable = true),
      StructField("cc_open_date_sk", LongType, nullable = true),
      StructField("cc_name", StringType, nullable = true),              // 50
      StructField("cc_class", StringType, nullable = true),             // 50
      StructField("cc_employees", IntegerType, nullable = true),
      StructField("cc_sq_ft", IntegerType, nullable = true),
      StructField("cc_hours", StringType, nullable = true),     // 20
      StructField("cc_manager", StringType, nullable = true),   // 40
      StructField("cc_mkt_id", IntegerType, nullable = true),
      StructField("cc_mkt_class", StringType, nullable = true),   // 50
      StructField("cc_mkt_desc", StringType, nullable = true),    // 100
      StructField("cc_market_manager", StringType, nullable = true),  // 40
      StructField("cc_division", IntegerType, nullable = true),
      StructField("cc_division_name", StringType, nullable = true),   // 50
      StructField("cc_company", IntegerType, nullable = true),
      StructField("cc_company_name", StringType, nullable = true),    // 50
      StructField("cc_street_number", StringType, nullable = true),   // 10
      StructField("cc_street_name", StringType, nullable = true),     // 60
      StructField("cc_street_type", StringType, nullable = true),     // 15
      StructField("cc_suite_number", StringType, nullable = true),    // 10
      StructField("cc_city", StringType, nullable = true),    // 60
      StructField("cc_county", StringType, nullable = true),  // 30
      StructField("cc_state", StringType, nullable = true),   // 2
      StructField("cc_zip", StringType, nullable = true),     // 10
      StructField("cc_country", StringType, nullable = true), // 20
      StructField("cc_gmt_offset", DoubleType, nullable = true),
      StructField("cc_tax_percentage", DoubleType, nullable = true)
    ),
    "catalog_page" -> Array(
      StructField("cp_catalog_page_sk", LongType, nullable = false),
      StructField("cp_catalog_page_id", StringType, nullable = false),   // 16
      StructField("cp_start_date_sk", LongType, nullable = true),
      StructField("cp_end_date_sk", LongType, nullable = true),
      StructField("cp_department", StringType, nullable = true),    // 50
      StructField("cp_catalog_number", IntegerType, nullable = true),
      StructField("cp_catalog_page_number", IntegerType, nullable = true),
      StructField("cp_description", StringType, nullable = true),    // 100
      StructField("cp_type", StringType, nullable = true)    // 100
    ),
    "web_site" -> Array(
      StructField("web_site_sk", LongType, nullable = false),
      StructField("web_site_id", StringType, nullable = false),       // 16
      StructField("web_rec_start_date", DateType, nullable = true),
      StructField("web_rec_end_date", DateType, nullable = true),
      StructField("web_name", StringType, nullable = true),           // 50
      StructField("web_open_date_sk", LongType, nullable = true),
      StructField("web_close_date_sk", LongType, nullable = true),
      StructField("web_class", StringType, nullable = true),          // 50
      StructField("web_manager", StringType, nullable = true),        // 40
      StructField("web_mkt_id", IntegerType, nullable = true),
      StructField("web_mkt_class", StringType, nullable = true),      // 50
      StructField("web_mkt_desc", StringType, nullable = true),       // 100
      StructField("web_market_manager", StringType, nullable = true), // 40
      StructField("web_company_id", IntegerType, nullable = true),
      StructField("web_company_name", StringType, nullable = true),   // 50
      StructField("web_street_number", StringType, nullable = true),  // 10
      StructField("web_street_name", StringType, nullable = true),    // 60
      StructField("web_street_type", StringType, nullable = true),    // 15
      StructField("web_suite_number", StringType, nullable = true),   // 10
      StructField("web_city", StringType, nullable = true),           // 60
      StructField("web_county", StringType, nullable = true),         // 30
      StructField("web_state", StringType, nullable = true),          // 2
      StructField("web_zip", StringType, nullable = true),            // 10
      StructField("web_country", StringType, nullable = true),        // 20
      StructField("web_gmt_offset", DoubleType, nullable = true),
      StructField("web_tax_percentage", DoubleType, nullable = true)
    ),
    "web_page" -> Array(
      StructField("wp_web_page_sk", LongType, nullable = false),
      StructField("wp_web_page_id", StringType, nullable = false),    // 16
      StructField("wp_rec_start_date", DateType, nullable = true),
      StructField("wp_rec_end_date", DateType, nullable = true),
      StructField("wp_creation_date_sk", LongType, nullable = true),  // 50
      StructField("wp_access_date_sk", LongType, nullable = true),
      StructField("wp_autogen_flag", StringType, nullable = true),    // 1
      StructField("wp_customer_sk", LongType, nullable = true),
      StructField("wp_url", StringType, nullable = true),     // 100
      StructField("wp_type", StringType, nullable = true),    // 50
      StructField("wp_char_count", IntegerType, nullable = true),
      StructField("wp_link_count", IntegerType, nullable = true),
      StructField("wp_image_count", IntegerType, nullable = true),
      StructField("wp_max_ad_count", IntegerType, nullable = true)
    ),
    "warehouse" -> Array(
      StructField("w_warehouse_sk", LongType, nullable = false),
      StructField("w_warehouse_id", StringType, nullable = false),    // 16
      StructField("w_warehouse_name", StringType, nullable = true),   // 20
      StructField("w_warehouse_sq_ft", IntegerType, nullable = true),
      StructField("w_street_number", StringType, nullable = true),    // 10
      StructField("w_street_name", StringType, nullable = true),      // 60
      StructField("w_street_type", StringType, nullable = true),      // 15
      StructField("w_suite_number", StringType, nullable = true),     // 10
      StructField("w_city", StringType, nullable = true),       // 60
      StructField("w_county", StringType, nullable = true),     // 30
      StructField("w_state", StringType, nullable = true),      // 2
      StructField("w_zip", StringType, nullable = true),        // 10
      StructField("w_country", StringType, nullable = true),    // 20
      StructField("w_gmt_offset", DoubleType, nullable = true)
    ),
    "customer" -> Array(
      StructField("c_customer_sk", LongType, nullable = false),
      StructField("c_customer_id", StringType, nullable = false),    // 16
      StructField("c_current_cdemo_sk", LongType, nullable = true),
      StructField("c_current_hdemo_sk", LongType, nullable = true),
      StructField("c_current_addr_sk", LongType, nullable = true),
      StructField("c_first_shipto_date_sk", LongType, nullable = true),
      StructField("c_first_sales_date_sk", LongType, nullable = true),
      StructField("c_salutation", StringType, nullable = true),     // 10
      StructField("c_first_name", StringType, nullable = true),     // 20
      StructField("c_last_name", StringType, nullable = true),      // 30
      StructField("c_preferred_cust_flag", StringType, nullable = true),  // 1
      StructField("c_birth_day", IntegerType, nullable = true),
      StructField("c_birth_month", IntegerType, nullable = true),
      StructField("c_birth_year", IntegerType, nullable = true),
      StructField("c_birth_country", StringType, nullable = true),    // 20
      StructField("c_login", StringType, nullable = true),            // 13
      StructField("c_email_address", StringType, nullable = true),    // 50
      StructField("c_last_review_date_sk", LongType, nullable = true)
    ),
    "customer_address" -> Array(
      StructField("ca_address_sk", LongType, nullable = false),
      StructField("ca_address_id", StringType, nullable = false),     // 16
      StructField("ca_street_number", StringType, nullable = true),   // 10
      StructField("ca_street_name", StringType, nullable = true),     // 60
      StructField("ca_street_type", StringType, nullable = true),     // 15
      StructField("ca_suite_number", StringType, nullable = true),    // 10
      StructField("ca_city", StringType, nullable = true),            // 60
      StructField("ca_county", StringType, nullable = true),          // 30
      StructField("ca_state", StringType, nullable = true),           // 2
      StructField("ca_zip", StringType, nullable = true),             // 10
      StructField("ca_country", StringType, nullable = true),         // 20
      StructField("ca_gmt_offset", DoubleType, nullable = true),
      StructField("ca_location_type", StringType, nullable = true)    // 20
    ),
    "customer_demographics" -> Array(
      StructField("cd_demo_sk", LongType, nullable = false),
      StructField("cd_gender", StringType, nullable = true),            // 1
      StructField("cd_marital_status", StringType, nullable = true),    // 1
      StructField("cd_education_status", StringType, nullable = true),  // 20
      StructField("cd_purchase_estimate", IntegerType, nullable = true),
      StructField("cd_credit_rating", StringType, nullable = true),     // 10
      StructField("cd_dep_count", IntegerType, nullable = true),
      StructField("cd_dep_employed_count", IntegerType, nullable = true),
      StructField("cd_dep_college_count", IntegerType, nullable = true)
    ),
    "date_dim" -> Array(
      StructField("d_date_sk", LongType, nullable = false),
      StructField("d_date_id", StringType, nullable = false),           // 16
      StructField("d_date", DateType, nullable = false),
      StructField("d_month_seq", IntegerType, nullable = true),
      StructField("d_week_seq", IntegerType, nullable = true),
      StructField("d_quarter_seq", IntegerType, nullable = true),
      StructField("d_year", IntegerType, nullable = true),
      StructField("d_dow", IntegerType, nullable = true),
      StructField("d_moy", IntegerType, nullable = true),
      StructField("d_dom", IntegerType, nullable = true),
      StructField("d_qoy", IntegerType, nullable = true),
      StructField("d_fy_year", IntegerType, nullable = true),
      StructField("d_fy_quarter_seq", IntegerType, nullable = true),
      StructField("d_fy_week_seq", IntegerType, nullable = true),
      StructField("d_day_name", StringType, nullable = true),       // 9
      StructField("d_quarter_name", StringType, nullable = true),   // 6
      StructField("d_holiday", StringType, nullable = true),        // 1
      StructField("d_weekend", StringType, nullable = true),        // 1
      StructField("d_following_holiday", StringType, nullable = true),  // 1
      StructField("d_first_dom", IntegerType, nullable = true),
      StructField("d_last_dom", IntegerType, nullable = true),
      StructField("d_same_day_ly", IntegerType, nullable = true),
      StructField("d_same_day_lq", IntegerType, nullable = true),
      StructField("d_current_day", StringType, nullable = true),     // 1
      StructField("d_current_week", StringType, nullable = true),     // 1
      StructField("d_current_month", StringType, nullable = true),     // 1
      StructField("d_current_quarter", StringType, nullable = true),     // 1
      StructField("d_current_year", StringType, nullable = true)     // 1
    ),
    "household_demographics" -> Array(
      StructField("hd_demo_sk", LongType, nullable = false),
      StructField("hd_income_band_sk", LongType, nullable = true),
      StructField("hd_buy_potential", StringType, nullable = true),    // 15
      StructField("hd_dep_count", IntegerType, nullable = true),
      StructField("hd_vehicle_count", IntegerType, nullable = true)
    ),
    "item" -> Array(
      StructField("i_item_sk", LongType, nullable = false),
      StructField("i_item_id", StringType, nullable = false),           // 16
      StructField("i_rec_start_date", DateType, nullable = true),
      StructField("i_rec_end_date", DateType, nullable = true),
      StructField("i_item_desc", StringType, nullable = true),    // 200
      StructField("i_current_price", DoubleType, nullable = true),
      StructField("i_wholesale_cost", DoubleType, nullable = true),
      StructField("i_brand_id", IntegerType, nullable = true),
      StructField("i_brand", StringType, nullable = true),    // 50
      StructField("i_class_id", IntegerType, nullable = true),
      StructField("i_class", StringType, nullable = true),    // 50
      StructField("i_category_id", IntegerType, nullable = true),
      StructField("i_category", StringType, nullable = true), // 50
      StructField("i_manufact_id", IntegerType, nullable = true),
      StructField("i_manufact", StringType, nullable = true), // 50
      StructField("i_size", StringType, nullable = true),     // 20
      StructField("i_formulation", StringType, nullable = true),  // 20
      StructField("i_color", StringType, nullable = true),    // 20
      StructField("i_units", StringType, nullable = true),    // 10
      StructField("i_container", StringType, nullable = true),  // 10
      StructField("i_manager_id", IntegerType, nullable = true),
      StructField("i_product_name", StringType, nullable = true)  // 50
    ),
    "income_band" -> Array(
      StructField("ib_income_band_sk", LongType, nullable = false),
      StructField("ib_lower_bound", IntegerType, nullable = true),
      StructField("ib_upper_bound", IntegerType, nullable = true)
    ),
    "promotion" -> Array(
      StructField("p_promo_sk", LongType, nullable = false),
      StructField("p_promo_id", StringType, nullable = false),           // 16
      StructField("p_start_date_sk", LongType, nullable = true),
      StructField("p_end_date_sk", LongType, nullable = true),
      StructField("p_item_sk", LongType, nullable = true),
      StructField("p_cost", DoubleType, nullable = true),
      StructField("p_response_target", IntegerType, nullable = true),
      StructField("p_promo_name", StringType, nullable = true),   // 50
      StructField("p_channel_dmail", StringType, nullable = true),     // 1
      StructField("p_channel_email", StringType, nullable = true),     // 1
      StructField("p_channel_catalog", StringType, nullable = true),     // 1
      StructField("p_channel_tv", StringType, nullable = true),     // 1
      StructField("p_channel_radio", StringType, nullable = true),     // 1
      StructField("p_channel_press", StringType, nullable = true),     // 1
      StructField("p_channel_event", StringType, nullable = true),     // 1
      StructField("p_channel_demo", StringType, nullable = true),     // 1
      StructField("p_channel_details", StringType, nullable = true),     // 100
      StructField("p_purpose", StringType, nullable = true),     // 15
      StructField("p_discount_active", StringType, nullable = true)     // 1
    ),
    "reason" -> Array(
      StructField("r_reason_sk", LongType, nullable = false),
      StructField("r_reason_id", StringType, nullable = false),       // 16
      StructField("r_reason_desc", StringType, nullable = true)       // 100
    ),
    "ship_mode" -> Array(
      StructField("sm_ship_mode_sk", LongType, nullable = false),
      StructField("sm_ship_mode_id", StringType, nullable = false),       // 16
      StructField("sm_type", StringType, nullable = true),    // 30
      StructField("sm_code", StringType, nullable = true),    // 10
      StructField("sm_carrier", StringType, nullable = true), // 20
      StructField("sm_contract", StringType, nullable = true) // 20
    ),
    "time_dim" -> Array(
      StructField("t_time_sk", LongType, nullable = false),
      StructField("t_time_id", StringType, nullable = false),       // 16
      StructField("t_time", IntegerType, nullable = false),
      StructField("t_hour", IntegerType, nullable = true),
      StructField("t_minute", IntegerType, nullable = true),
      StructField("t_second", IntegerType, nullable = true),
      StructField("t_am_pm", StringType, nullable = true),    // 2
      StructField("t_shift", StringType, nullable = true),    // 20
      StructField("t_sub_shift", StringType, nullable = true),  // 20
      StructField("t_meal_time", StringType, nullable = true)   //20
    )
  )

  override val queries: List[(String,String)] = List(
    "Q01" ->
      """
      |with customer_total_return as
      |(select sr_customer_sk as ctr_customer_sk
      |,sr_store_sk as ctr_store_sk
      |,sum(SR_FEE) as ctr_total_return
      |from store_returns
      |,date_dim
      |where sr_returned_date_sk = d_date_sk
      |and d_year =2000
      |group by sr_customer_sk
      |,sr_store_sk)
      | select c_customer_id
      |from customer_total_return ctr1
      |,store
      |,customer
      |where ctr1.ctr_total_return > (select avg(ctr_total_return)*1.2
      |from customer_total_return ctr2
      |where ctr1.ctr_store_sk = ctr2.ctr_store_sk)
      |and s_store_sk = ctr1.ctr_store_sk
      |and s_state = 'TN'
      |and ctr1.ctr_customer_sk = c_customer_sk
      |order by c_customer_id
      |""".stripMargin,

    "Q02" ->
      """
        |with wscs as
        | (select sold_date_sk
        |        ,sales_price
        |  from (select ws_sold_date_sk sold_date_sk
        |              ,ws_ext_sales_price sales_price
        |        from web_sales
        |        union all
        |        select cs_sold_date_sk sold_date_sk
        |              ,cs_ext_sales_price sales_price
        |        from catalog_sales)),
        | wswscs as
        | (select d_week_seq,
        |        sum(case when (d_day_name='Sunday') then sales_price else null end) sun_sales,
        |        sum(case when (d_day_name='Monday') then sales_price else null end) mon_sales,
        |        sum(case when (d_day_name='Tuesday') then sales_price else  null end) tue_sales,
        |        sum(case when (d_day_name='Wednesday') then sales_price else null end) wed_sales,
        |        sum(case when (d_day_name='Thursday') then sales_price else null end) thu_sales,
        |        sum(case when (d_day_name='Friday') then sales_price else null end) fri_sales,
        |        sum(case when (d_day_name='Saturday') then sales_price else null end) sat_sales
        | from wscs
        |     ,date_dim
        | where d_date_sk = sold_date_sk
        | group by d_week_seq)
        | select d_week_seq1
        |       ,round(sun_sales1/sun_sales2,2)
        |       ,round(mon_sales1/mon_sales2,2)
        |       ,round(tue_sales1/tue_sales2,2)
        |       ,round(wed_sales1/wed_sales2,2)
        |       ,round(thu_sales1/thu_sales2,2)
        |       ,round(fri_sales1/fri_sales2,2)
        |       ,round(sat_sales1/sat_sales2,2)
        | from
        | (select wswscs.d_week_seq d_week_seq1
        |        ,sun_sales sun_sales1
        |        ,mon_sales mon_sales1
        |        ,tue_sales tue_sales1
        |        ,wed_sales wed_sales1
        |        ,thu_sales thu_sales1
        |        ,fri_sales fri_sales1
        |        ,sat_sales sat_sales1
        |  from wswscs,date_dim
        |  where date_dim.d_week_seq = wswscs.d_week_seq and
        |        d_year = 2001) y,
        | (select wswscs.d_week_seq d_week_seq2
        |        ,sun_sales sun_sales2
        |        ,mon_sales mon_sales2
        |        ,tue_sales tue_sales2
        |        ,wed_sales wed_sales2
        |        ,thu_sales thu_sales2
        |        ,fri_sales fri_sales2
        |        ,sat_sales sat_sales2
        |  from wswscs
        |      ,date_dim
        |  where date_dim.d_week_seq = wswscs.d_week_seq and
        |        d_year = 2001+1) z
        | where d_week_seq1=d_week_seq2-53
        | order by d_week_seq1
        |""".stripMargin,

    "Q03" ->
      """
        |select dt.d_year
        |       ,item.i_brand_id brand_id
        |       ,item.i_brand brand
        |       ,sum(ss_ext_sales_price) sum_agg
        | from  date_dim dt
        |      ,store_sales
        |      ,item
        | where dt.d_date_sk = store_sales.ss_sold_date_sk
        |   and store_sales.ss_item_sk = item.i_item_sk
        |   and item.i_manufact_id = 436
        |   and dt.d_moy=12
        | group by dt.d_year
        |      ,item.i_brand
        |      ,item.i_brand_id
        | order by dt.d_year
        |         ,sum_agg desc
        |         ,brand_id
        |""".stripMargin,

    "Q04" ->
      """
        |with year_total as (
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,c_preferred_cust_flag customer_preferred_cust_flag
        |       ,c_birth_country customer_birth_country
        |       ,c_login customer_login
        |       ,c_email_address customer_email_address
        |       ,d_year dyear
        |       ,sum(((ss_ext_list_price-ss_ext_wholesale_cost-ss_ext_discount_amt)+ss_ext_sales_price)/2) year_total
        |       ,'s' sale_type
        | from customer
        |     ,store_sales
        |     ,date_dim
        | where c_customer_sk = ss_customer_sk
        |   and ss_sold_date_sk = d_date_sk
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,c_preferred_cust_flag
        |         ,c_birth_country
        |         ,c_login
        |         ,c_email_address
        |         ,d_year
        | union all
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,c_preferred_cust_flag customer_preferred_cust_flag
        |       ,c_birth_country customer_birth_country
        |       ,c_login customer_login
        |       ,c_email_address customer_email_address
        |       ,d_year dyear
        |       ,sum((((cs_ext_list_price-cs_ext_wholesale_cost-cs_ext_discount_amt)+cs_ext_sales_price)/2) ) year_total
        |       ,'c' sale_type
        | from customer
        |     ,catalog_sales
        |     ,date_dim
        | where c_customer_sk = cs_bill_customer_sk
        |   and cs_sold_date_sk = d_date_sk
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,c_preferred_cust_flag
        |         ,c_birth_country
        |         ,c_login
        |         ,c_email_address
        |         ,d_year
        |union all
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,c_preferred_cust_flag customer_preferred_cust_flag
        |       ,c_birth_country customer_birth_country
        |       ,c_login customer_login
        |       ,c_email_address customer_email_address
        |       ,d_year dyear
        |       ,sum((((ws_ext_list_price-ws_ext_wholesale_cost-ws_ext_discount_amt)+ws_ext_sales_price)/2) ) year_total
        |       ,'w' sale_type
        | from customer
        |     ,web_sales
        |     ,date_dim
        | where c_customer_sk = ws_bill_customer_sk
        |   and ws_sold_date_sk = d_date_sk
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,c_preferred_cust_flag
        |         ,c_birth_country
        |         ,c_login
        |         ,c_email_address
        |         ,d_year
        |         )
        |  select
        |                  t_s_secyear.customer_id
        |                 ,t_s_secyear.customer_first_name
        |                 ,t_s_secyear.customer_last_name
        |                 ,t_s_secyear.customer_email_address
        | from year_total t_s_firstyear
        |     ,year_total t_s_secyear
        |     ,year_total t_c_firstyear
        |     ,year_total t_c_secyear
        |     ,year_total t_w_firstyear
        |     ,year_total t_w_secyear
        | where t_s_secyear.customer_id = t_s_firstyear.customer_id
        |   and t_s_firstyear.customer_id = t_c_secyear.customer_id
        |   and t_s_firstyear.customer_id = t_c_firstyear.customer_id
        |   and t_s_firstyear.customer_id = t_w_firstyear.customer_id
        |   and t_s_firstyear.customer_id = t_w_secyear.customer_id
        |   and t_s_firstyear.sale_type = 's'
        |   and t_c_firstyear.sale_type = 'c'
        |   and t_w_firstyear.sale_type = 'w'
        |   and t_s_secyear.sale_type = 's'
        |   and t_c_secyear.sale_type = 'c'
        |   and t_w_secyear.sale_type = 'w'
        |   and t_s_firstyear.dyear =  2001
        |   and t_s_secyear.dyear = 2001+1
        |   and t_c_firstyear.dyear =  2001
        |   and t_c_secyear.dyear =  2001+1
        |   and t_w_firstyear.dyear = 2001
        |   and t_w_secyear.dyear = 2001+1
        |   and t_s_firstyear.year_total > 0
        |   and t_c_firstyear.year_total > 0
        |   and t_w_firstyear.year_total > 0
        |   and case when t_c_firstyear.year_total > 0 then t_c_secyear.year_total / t_c_firstyear.year_total else null end
        |           > case when t_s_firstyear.year_total > 0 then t_s_secyear.year_total / t_s_firstyear.year_total else null end
        |   and case when t_c_firstyear.year_total > 0 then t_c_secyear.year_total / t_c_firstyear.year_total else null end
        |           > case when t_w_firstyear.year_total > 0 then t_w_secyear.year_total / t_w_firstyear.year_total else null end
        | order by t_s_secyear.customer_id
        |         ,t_s_secyear.customer_first_name
        |         ,t_s_secyear.customer_last_name
        |         ,t_s_secyear.customer_email_address
        |""".stripMargin,

    "Q06" ->
      """
        |select a.ca_state state, count(*) cnt
        | from customer_address a
        |     ,customer c
        |     ,store_sales s
        |     ,date_dim d
        |     ,item i
        | where       a.ca_address_sk = c.c_current_addr_sk
        | 	and c.c_customer_sk = s.ss_customer_sk
        | 	and s.ss_sold_date_sk = d.d_date_sk
        | 	and s.ss_item_sk = i.i_item_sk
        | 	and d.d_month_seq =
        | 	     (select distinct (d_month_seq)
        | 	      from date_dim
        |               where d_year = 2000
        | 	        and d_moy = 2 )
        | 	and i.i_current_price > 1.2 *
        |             (select avg(j.i_current_price)
        | 	     from item j
        | 	     where j.i_category = i.i_category)
        | group by a.ca_state
        | having count(*) >= 10
        | order by cnt, a.ca_state
        |""".stripMargin,

    "Q07" ->
      """
        |select i_item_id,
        |        avg(ss_quantity) agg1,
        |        avg(ss_list_price) agg2,
        |        avg(ss_coupon_amt) agg3,
        |        avg(ss_sales_price) agg4
        | from store_sales, customer_demographics, date_dim, item, promotion
        | where ss_sold_date_sk = d_date_sk and
        |       ss_item_sk = i_item_sk and
        |       ss_cdemo_sk = cd_demo_sk and
        |       ss_promo_sk = p_promo_sk and
        |       cd_gender = 'F' and
        |       cd_marital_status = 'W' and
        |       cd_education_status = 'Primary' and
        |       (p_channel_email = 'N' or p_channel_event = 'N') and
        |       d_year = 1998
        | group by i_item_id
        | order by i_item_id
        |""".stripMargin,

    "Q10" ->
      """
        |select
        |  cd_gender,
        |  cd_marital_status,
        |  cd_education_status,
        |  count(*) cnt1,
        |  cd_purchase_estimate,
        |  count(*) cnt2,
        |  cd_credit_rating,
        |  count(*) cnt3,
        |  cd_dep_count,
        |  count(*) cnt4,
        |  cd_dep_employed_count,
        |  count(*) cnt5,
        |  cd_dep_college_count,
        |  count(*) cnt6
        | from
        |  customer c,customer_address ca,customer_demographics
        | where
        |  c.c_current_addr_sk = ca.ca_address_sk and
        |  ca_county in ('Walker County','Richland County','Gaines County','Douglas County','Dona Ana County') and
        |  cd_demo_sk = c.c_current_cdemo_sk and
        |  exists (select *
        |          from store_sales,date_dim
        |          where c.c_customer_sk = ss_customer_sk and
        |                ss_sold_date_sk = d_date_sk and
        |                d_year = 2002 and
        |                d_moy between 4 and 4+3) and
        |   (exists (select *
        |            from web_sales,date_dim
        |            where c.c_customer_sk = ws_bill_customer_sk and
        |                  ws_sold_date_sk = d_date_sk and
        |                  d_year = 2002 and
        |                  d_moy between 4 ANd 4+3) or
        |    exists (select *
        |            from catalog_sales,date_dim
        |            where c.c_customer_sk = cs_ship_customer_sk and
        |                  cs_sold_date_sk = d_date_sk and
        |                  d_year = 2002 and
        |                  d_moy between 4 and 4+3))
        | group by cd_gender,
        |          cd_marital_status,
        |          cd_education_status,
        |          cd_purchase_estimate,
        |          cd_credit_rating,
        |          cd_dep_count,
        |          cd_dep_employed_count,
        |          cd_dep_college_count
        | order by cd_gender,
        |          cd_marital_status,
        |          cd_education_status,
        |          cd_purchase_estimate,
        |          cd_credit_rating,
        |          cd_dep_count,
        |          cd_dep_employed_count,
        |          cd_dep_college_count
        |""".stripMargin,

    "Q11" ->
      """
        |with year_total as (
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,c_preferred_cust_flag customer_preferred_cust_flag
        |       ,c_birth_country customer_birth_country
        |       ,c_login customer_login
        |       ,c_email_address customer_email_address
        |       ,d_year dyear
        |       ,sum(ss_ext_list_price-ss_ext_discount_amt) year_total
        |       ,'s' sale_type
        | from customer
        |     ,store_sales
        |     ,date_dim
        | where c_customer_sk = ss_customer_sk
        |   and ss_sold_date_sk = d_date_sk
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,c_preferred_cust_flag
        |         ,c_birth_country
        |         ,c_login
        |         ,c_email_address
        |         ,d_year
        | union all
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,c_preferred_cust_flag customer_preferred_cust_flag
        |       ,c_birth_country customer_birth_country
        |       ,c_login customer_login
        |       ,c_email_address customer_email_address
        |       ,d_year dyear
        |       ,sum(ws_ext_list_price-ws_ext_discount_amt) year_total
        |       ,'w' sale_type
        | from customer
        |     ,web_sales
        |     ,date_dim
        | where c_customer_sk = ws_bill_customer_sk
        |   and ws_sold_date_sk = d_date_sk
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,c_preferred_cust_flag
        |         ,c_birth_country
        |         ,c_login
        |         ,c_email_address
        |         ,d_year
        |         )
        |  select
        |                  t_s_secyear.customer_id
        |                 ,t_s_secyear.customer_first_name
        |                 ,t_s_secyear.customer_last_name
        |                 ,t_s_secyear.customer_email_address
        | from year_total t_s_firstyear
        |     ,year_total t_s_secyear
        |     ,year_total t_w_firstyear
        |     ,year_total t_w_secyear
        | where t_s_secyear.customer_id = t_s_firstyear.customer_id
        |         and t_s_firstyear.customer_id = t_w_secyear.customer_id
        |         and t_s_firstyear.customer_id = t_w_firstyear.customer_id
        |         and t_s_firstyear.sale_type = 's'
        |         and t_w_firstyear.sale_type = 'w'
        |         and t_s_secyear.sale_type = 's'
        |         and t_w_secyear.sale_type = 'w'
        |         and t_s_firstyear.dyear = 2001
        |         and t_s_secyear.dyear = 2001+1
        |         and t_w_firstyear.dyear = 2001
        |         and t_w_secyear.dyear = 2001+1
        |         and t_s_firstyear.year_total > 0
        |         and t_w_firstyear.year_total > 0
        |         and case when t_w_firstyear.year_total > 0 then t_w_secyear.year_total / t_w_firstyear.year_total else 0.0 end
        |             > case when t_s_firstyear.year_total > 0 then t_s_secyear.year_total / t_s_firstyear.year_total else 0.0 end
        | order by t_s_secyear.customer_id
        |         ,t_s_secyear.customer_first_name
        |         ,t_s_secyear.customer_last_name
        |         ,t_s_secyear.customer_email_address
        |""".stripMargin,

    "Q13" ->
      """
        |select avg(ss_quantity)
        |       ,avg(ss_ext_sales_price)
        |       ,avg(ss_ext_wholesale_cost)
        |       ,sum(ss_ext_wholesale_cost)
        | from store_sales
        |     ,store
        |     ,customer_demographics
        |     ,household_demographics
        |     ,customer_address
        |     ,date_dim
        | where s_store_sk = ss_store_sk
        | and  ss_sold_date_sk = d_date_sk and d_year = 2001
        | and((ss_hdemo_sk=hd_demo_sk
        |  and cd_demo_sk = ss_cdemo_sk
        |  and cd_marital_status = 'D'
        |  and cd_education_status = '2 yr Degree'
        |  and ss_sales_price between 100.00 and 150.00
        |  and hd_dep_count = 3
        |     )or
        |     (ss_hdemo_sk=hd_demo_sk
        |  and cd_demo_sk = ss_cdemo_sk
        |  and cd_marital_status = 'S'
        |  and cd_education_status = 'Secondary'
        |  and ss_sales_price between 50.00 and 100.00
        |  and hd_dep_count = 1
        |     ) or
        |     (ss_hdemo_sk=hd_demo_sk
        |  and cd_demo_sk = ss_cdemo_sk
        |  and cd_marital_status = 'W'
        |  and cd_education_status = 'Advanced Degree'
        |  and ss_sales_price between 150.00 and 200.00
        |  and hd_dep_count = 1
        |     ))
        | and((ss_addr_sk = ca_address_sk
        |  and ca_country = 'United States'
        |  and ca_state in ('CO', 'IL', 'MN')
        |  and ss_net_profit between 100 and 200
        |     ) or
        |     (ss_addr_sk = ca_address_sk
        |  and ca_country = 'United States'
        |  and ca_state in ('OH', 'MT', 'NM')
        |  and ss_net_profit between 150 and 300
        |     ) or
        |     (ss_addr_sk = ca_address_sk
        |  and ca_country = 'United States'
        |  and ca_state in ('TX', 'MO', 'MI')
        |  and ss_net_profit between 50 and 250
        |     ))
        |""".stripMargin,

    "Q15" ->
      """
        |select ca_zip
        |       ,sum(cs_sales_price)
        | from catalog_sales
        |     ,customer
        |     ,customer_address
        |     ,date_dim
        | where cs_bill_customer_sk = c_customer_sk
        | 	and c_current_addr_sk = ca_address_sk
        | 	and ( substr(ca_zip,1,5) in ('85669', '86197','88274','83405','86475',
        |                                   '85392', '85460', '80348', '81792')
        | 	      or ca_state in ('CA','WA','GA')
        | 	      or cs_sales_price > 500)
        | 	and cs_sold_date_sk = d_date_sk
        | 	and d_qoy = 2 and d_year = 2000
        | group by ca_zip
        | order by ca_zip
        |""".stripMargin,

    "Q17" ->
      """
        |select i_item_id
        |       ,i_item_desc
        |       ,s_state
        |       ,count(ss_quantity) as store_sales_quantitycount
        |       ,avg(ss_quantity) as store_sales_quantityave
        |       ,stddev_samp(ss_quantity) as store_sales_quantitystdev
        |       ,stddev_samp(ss_quantity)/avg(ss_quantity) as store_sales_quantitycov
        |       ,count(sr_return_quantity) as store_returns_quantitycount
        |       ,avg(sr_return_quantity) as store_returns_quantityave
        |       ,stddev_samp(sr_return_quantity) as store_returns_quantitystdev
        |       ,stddev_samp(sr_return_quantity)/avg(sr_return_quantity) as store_returns_quantitycov
        |       ,count(cs_quantity) as catalog_sales_quantitycount ,avg(cs_quantity) as catalog_sales_quantityave
        |       ,stddev_samp(cs_quantity) as catalog_sales_quantitystdev
        |       ,stddev_samp(cs_quantity)/avg(cs_quantity) as catalog_sales_quantitycov
        | from store_sales
        |     ,store_returns
        |     ,catalog_sales
        |     ,date_dim d1
        |     ,date_dim d2
        |     ,date_dim d3
        |     ,store
        |     ,item
        | where d1.d_quarter_name = '1998Q1'
        |   and d1.d_date_sk = ss_sold_date_sk
        |   and i_item_sk = ss_item_sk
        |   and s_store_sk = ss_store_sk
        |   and ss_customer_sk = sr_customer_sk
        |   and ss_item_sk = sr_item_sk
        |   and ss_ticket_number = sr_ticket_number
        |   and sr_returned_date_sk = d2.d_date_sk
        |   and d2.d_quarter_name in ('1998Q1','1998Q2','1998Q3')
        |   and sr_customer_sk = cs_bill_customer_sk
        |   and sr_item_sk = cs_item_sk
        |   and cs_sold_date_sk = d3.d_date_sk
        |   and d3.d_quarter_name in ('1998Q1','1998Q2','1998Q3')
        | group by i_item_id
        |         ,i_item_desc
        |         ,s_state
        | order by i_item_id
        |         ,i_item_desc
        |         ,s_state
        |""".stripMargin,

    "Q18" ->
      """
        |select i_item_id,
        |        ca_country,
        |        ca_state,
        |        ca_county,
        |        avg( cast(cs_quantity as decimal(12,2))) agg1,
        |        avg( cast(cs_list_price as decimal(12,2))) agg2,
        |        avg( cast(cs_coupon_amt as decimal(12,2))) agg3,
        |        avg( cast(cs_sales_price as decimal(12,2))) agg4,
        |        avg( cast(cs_net_profit as decimal(12,2))) agg5,
        |        avg( cast(c_birth_year as decimal(12,2))) agg6,
        |        avg( cast(cd1.cd_dep_count as decimal(12,2))) agg7
        | from catalog_sales, customer_demographics cd1,
        |      customer_demographics cd2, customer, customer_address, date_dim, item
        | where cs_sold_date_sk = d_date_sk and
        |       cs_item_sk = i_item_sk and
        |       cs_bill_cdemo_sk = cd1.cd_demo_sk and
        |       cs_bill_customer_sk = c_customer_sk and
        |       cd1.cd_gender = 'M' and
        |       cd1.cd_education_status = 'College' and
        |       c_current_cdemo_sk = cd2.cd_demo_sk and
        |       c_current_addr_sk = ca_address_sk and
        |       c_birth_month in (9,5,12,4,1,10) and
        |       d_year = 2001 and
        |       ca_state in ('ND','WI','AL'
        |                   ,'NC','OK','MS','TN')
        | group by rollup (i_item_id, ca_country, ca_state, ca_county)
        | order by ca_country,
        |        ca_state,
        |        ca_county,
        |	i_item_id
        |""".stripMargin,

    "Q19" ->
      """
        |select i_brand_id brand_id, i_brand brand, i_manufact_id, i_manufact,
        | 	sum(ss_ext_sales_price) ext_price
        | from date_dim, store_sales, item,customer,customer_address,store
        | where d_date_sk = ss_sold_date_sk
        |   and ss_item_sk = i_item_sk
        |   and i_manager_id=7
        |   and d_moy=11
        |   and d_year=1999
        |   and ss_customer_sk = c_customer_sk
        |   and c_current_addr_sk = ca_address_sk
        |   and substr(ca_zip,1,5) <> substr(s_zip,1,5)
        |   and ss_store_sk = s_store_sk
        | group by i_brand
        |      ,i_brand_id
        |      ,i_manufact_id
        |      ,i_manufact
        | order by ext_price desc
        |         ,i_brand
        |         ,i_brand_id
        |         ,i_manufact_id
        |         ,i_manufact
        |""".stripMargin,

    "Q22" ->
      """
        |select i_product_name
        |             ,i_brand
        |             ,i_class
        |             ,i_category
        |             ,avg(inv_quantity_on_hand) qoh
        |       from inventory
        |           ,date_dim
        |           ,item
        |       where inv_date_sk=d_date_sk
        |              and inv_item_sk=i_item_sk
        |              and d_month_seq between 1212 and 1212 + 11
        |       group by rollup(i_product_name
        |                       ,i_brand
        |                       ,i_class
        |                       ,i_category)
        |order by qoh, i_product_name, i_brand, i_class, i_category
        |""".stripMargin,

    "Q24" ->
      """
        with ssales as
        |(select c_last_name
        |      ,c_first_name
        |      ,s_store_name
        |      ,ca_state
        |      ,s_state
        |      ,i_color
        |      ,i_current_price
        |      ,i_manager_id
        |      ,i_units
        |      ,i_size
        |      ,sum(ss_sales_price) netpaid
        |from store_sales
        |    ,store_returns
        |    ,store
        |    ,item
        |    ,customer
        |    ,customer_address
        |where ss_ticket_number = sr_ticket_number
        |  and ss_item_sk = sr_item_sk
        |  and ss_customer_sk = c_customer_sk
        |  and ss_item_sk = i_item_sk
        |  and ss_store_sk = s_store_sk
        |  and c_current_addr_sk = ca_address_sk
        |  and c_birth_country <> upper(ca_country)
        |  and s_zip = ca_zip
        |  and s_market_id = 7
        |group by c_last_name
        |        ,c_first_name
        |        ,s_store_name
        |        ,ca_state
        |        ,s_state
        |        ,i_color
        |        ,i_current_price
        |        ,i_manager_id
        |        ,i_units
        |        ,i_size)
        |select c_last_name
        |      ,c_first_name
        |      ,s_store_name
        |      ,sum(netpaid) paid
        |from ssales
        |where i_color = 'chiffon'
        |group by c_last_name
        |        ,c_first_name
        |        ,s_store_name
        |having sum(netpaid) > (select 0.05*avg(netpaid)
        |                           from ssales)
        |order by c_last_name
        |        ,c_first_name
        |        ,s_store_name
        |""".stripMargin,

    "Q25" ->
      """
        |select
        | i_item_id
        | ,i_item_desc
        | ,s_store_id
        | ,s_store_name
        | ,sum(ss_net_profit) as store_sales_profit
        | ,sum(sr_net_loss) as store_returns_loss
        | ,sum(cs_net_profit) as catalog_sales_profit
        | from
        | store_sales
        | ,store_returns
        | ,catalog_sales
        | ,date_dim d1
        | ,date_dim d2
        | ,date_dim d3
        | ,store
        | ,item
        | where
        | d1.d_moy = 4
        | and d1.d_year = 2000
        | and d1.d_date_sk = ss_sold_date_sk
        | and i_item_sk = ss_item_sk
        | and s_store_sk = ss_store_sk
        | and ss_customer_sk = sr_customer_sk
        | and ss_item_sk = sr_item_sk
        | and ss_ticket_number = sr_ticket_number
        | and sr_returned_date_sk = d2.d_date_sk
        | and d2.d_moy               between 4 and  10
        | and d2.d_year              = 2000
        | and sr_customer_sk = cs_bill_customer_sk
        | and sr_item_sk = cs_item_sk
        | and cs_sold_date_sk = d3.d_date_sk
        | and d3.d_moy               between 4 and  10
        | and d3.d_year              = 2000
        | group by
        | i_item_id
        | ,i_item_desc
        | ,s_store_id
        | ,s_store_name
        | order by
        | i_item_id
        | ,i_item_desc
        | ,s_store_id
        | ,s_store_name
        |""".stripMargin,

    "Q26" ->
      """
        |select i_item_id,
        |        avg(cs_quantity) agg1,
        |        avg(cs_list_price) agg2,
        |        avg(cs_coupon_amt) agg3,
        |        avg(cs_sales_price) agg4
        | from catalog_sales, customer_demographics, date_dim, item, promotion
        | where cs_sold_date_sk = d_date_sk and
        |       cs_item_sk = i_item_sk and
        |       cs_bill_cdemo_sk = cd_demo_sk and
        |       cs_promo_sk = p_promo_sk and
        |       cd_gender = 'F' and
        |       cd_marital_status = 'W' and
        |       cd_education_status = 'Primary' and
        |       (p_channel_email = 'N' or p_channel_event = 'N') and
        |       d_year = 1998
        | group by i_item_id
        | order by i_item_id
        |""".stripMargin,

    "Q27" ->
      """
        |select i_item_id,
        |        s_state, grouping(s_state) g_state,
        |        avg(ss_quantity) agg1,
        |        avg(ss_list_price) agg2,
        |        avg(ss_coupon_amt) agg3,
        |        avg(ss_sales_price) agg4
        | from store_sales, customer_demographics, date_dim, store, item
        | where ss_sold_date_sk = d_date_sk and
        |       ss_item_sk = i_item_sk and
        |       ss_store_sk = s_store_sk and
        |       ss_cdemo_sk = cd_demo_sk and
        |       cd_gender = 'F' and
        |       cd_marital_status = 'W' and
        |       cd_education_status = 'Primary' and
        |       d_year = 1998 and
        |       s_state in ('TN','TN', 'TN', 'TN', 'TN', 'TN')
        | group by rollup (i_item_id, s_state)
        | order by i_item_id
        |         ,s_state
        |""".stripMargin,

    "Q29" ->
      """
        |select
        |     i_item_id
        |    ,i_item_desc
        |    ,s_store_id
        |    ,s_store_name
        |    ,sum(ss_quantity)        as store_sales_quantity
        |    ,sum(sr_return_quantity) as store_returns_quantity
        |    ,sum(cs_quantity)        as catalog_sales_quantity
        | from
        |    store_sales
        |   ,store_returns
        |   ,catalog_sales
        |   ,date_dim             d1
        |   ,date_dim             d2
        |   ,date_dim             d3
        |   ,store
        |   ,item
        | where
        |     d1.d_moy               = 4
        | and d1.d_year              = 1999
        | and d1.d_date_sk           = ss_sold_date_sk
        | and i_item_sk              = ss_item_sk
        | and s_store_sk             = ss_store_sk
        | and ss_customer_sk         = sr_customer_sk
        | and ss_item_sk             = sr_item_sk
        | and ss_ticket_number       = sr_ticket_number
        | and sr_returned_date_sk    = d2.d_date_sk
        | and d2.d_moy               between 4 and  4 + 3
        | and d2.d_year              = 1999
        | and sr_customer_sk         = cs_bill_customer_sk
        | and sr_item_sk             = cs_item_sk
        | and cs_sold_date_sk        = d3.d_date_sk
        | and d3.d_year              in (1999,1999+1,1999+2)
        | group by
        |    i_item_id
        |   ,i_item_desc
        |   ,s_store_id
        |   ,s_store_name
        | order by
        |    i_item_id
        |   ,i_item_desc
        |   ,s_store_id
        |   ,s_store_name
        |""".stripMargin,

    "Q30" ->
      """
        |with customer_total_return as
        | (select wr_returning_customer_sk as ctr_customer_sk
        |        ,ca_state as ctr_state,
        | 	sum(wr_return_amt) as ctr_total_return
        | from web_returns
        |     ,date_dim
        |     ,customer_address
        | where wr_returned_date_sk = d_date_sk
        |   and d_year =2002
        |   and wr_returning_addr_sk = ca_address_sk
        | group by wr_returning_customer_sk
        |         ,ca_state)
        |  select c_customer_id,c_salutation,c_first_name,c_last_name,c_preferred_cust_flag
        |       ,c_birth_day,c_birth_month,c_birth_year,c_birth_country,c_login,c_email_address
        |       ,c_last_review_date_sk,ctr_total_return
        | from customer_total_return ctr1
        |     ,customer_address
        |     ,customer
        | where ctr1.ctr_total_return > (select avg(ctr_total_return)*1.2
        | 			  from customer_total_return ctr2
        |                  	  where ctr1.ctr_state = ctr2.ctr_state)
        |       and ca_address_sk = c_current_addr_sk
        |       and ca_state = 'IL'
        |       and ctr1.ctr_customer_sk = c_customer_sk
        | order by c_customer_id,c_salutation,c_first_name,c_last_name,c_preferred_cust_flag
        |                  ,c_birth_day,c_birth_month,c_birth_year,c_birth_country,c_login,c_email_address
        |                  ,c_last_review_date_sk,ctr_total_return
        |""".stripMargin,

    "Q31" ->
      """
        |with ss as
        | (select ca_county,d_qoy, d_year,sum(ss_ext_sales_price) as store_sales
        | from store_sales,date_dim,customer_address
        | where ss_sold_date_sk = d_date_sk
        |  and ss_addr_sk=ca_address_sk
        | group by ca_county,d_qoy, d_year),
        | ws as
        | (select ca_county,d_qoy, d_year,sum(ws_ext_sales_price) as web_sales
        | from web_sales,date_dim,customer_address
        | where ws_sold_date_sk = d_date_sk
        |  and ws_bill_addr_sk=ca_address_sk
        | group by ca_county,d_qoy, d_year)
        | select
        |        ss1.ca_county
        |       ,ss1.d_year
        |       ,ws2.web_sales/ws1.web_sales web_q1_q2_increase
        |       ,ss2.store_sales/ss1.store_sales store_q1_q2_increase
        |       ,ws3.web_sales/ws2.web_sales web_q2_q3_increase
        |       ,ss3.store_sales/ss2.store_sales store_q2_q3_increase
        | from
        |        ss ss1
        |       ,ss ss2
        |       ,ss ss3
        |       ,ws ws1
        |       ,ws ws2
        |       ,ws ws3
        | where
        |    ss1.d_qoy = 1
        |    and ss1.d_year = 2000
        |    and ss1.ca_county = ss2.ca_county
        |    and ss2.d_qoy = 2
        |    and ss2.d_year = 2000
        | and ss2.ca_county = ss3.ca_county
        |    and ss3.d_qoy = 3
        |    and ss3.d_year = 2000
        |    and ss1.ca_county = ws1.ca_county
        |    and ws1.d_qoy = 1
        |    and ws1.d_year = 2000
        |    and ws1.ca_county = ws2.ca_county
        |    and ws2.d_qoy = 2
        |    and ws2.d_year = 2000
        |    and ws1.ca_county = ws3.ca_county
        |    and ws3.d_qoy = 3
        |    and ws3.d_year =2000
        |    and case when ws1.web_sales > 0 then ws2.web_sales/ws1.web_sales else null end
        |       > case when ss1.store_sales > 0 then ss2.store_sales/ss1.store_sales else null end
        |    and case when ws2.web_sales > 0 then ws3.web_sales/ws2.web_sales else null end
        |       > case when ss2.store_sales > 0 then ss3.store_sales/ss2.store_sales else null end
        | order by ss1.d_year
        |""".stripMargin,

    "Q33" ->
      """
        |with ss as (
        | select
        |          i_manufact_id,sum(ss_ext_sales_price) total_sales
        | from
        | 	store_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_manufact_id in (select
        |  i_manufact_id
        |from
        | item
        |where i_category in ('Books'))
        | and     ss_item_sk              = i_item_sk
        | and     ss_sold_date_sk         = d_date_sk
        | and     d_year                  = 1999
        | and     d_moy                   = 3
        | and     ss_addr_sk              = ca_address_sk
        | and     ca_gmt_offset           = -5
        | group by i_manufact_id),
        | cs as (
        | select
        |          i_manufact_id,sum(cs_ext_sales_price) total_sales
        | from
        | 	catalog_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_manufact_id               in (select
        |  i_manufact_id
        |from
        | item
        |where i_category in ('Books'))
        | and     cs_item_sk              = i_item_sk
        | and     cs_sold_date_sk         = d_date_sk
        | and     d_year                  = 1999
        | and     d_moy                   = 3
        | and     cs_bill_addr_sk         = ca_address_sk
        | and     ca_gmt_offset           = -5
        | group by i_manufact_id),
        | ws as (
        | select
        |          i_manufact_id,sum(ws_ext_sales_price) total_sales
        | from
        | 	web_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_manufact_id               in (select
        |  i_manufact_id
        |from
        | item
        |where i_category in ('Books'))
        | and     ws_item_sk              = i_item_sk
        | and     ws_sold_date_sk         = d_date_sk
        | and     d_year                  = 1999
        | and     d_moy                   = 3
        | and     ws_bill_addr_sk         = ca_address_sk
        | and     ca_gmt_offset           = -5
        | group by i_manufact_id)
        |  select i_manufact_id ,sum(total_sales) total_sales
        | from  (select * from ss
        |        union all
        |        select * from cs
        |        union all
        |        select * from ws) tmp1
        | group by i_manufact_id
        | order by total_sales
        |""".stripMargin,

    "Q34" ->
      """
        |select c_last_name
        |       ,c_first_name
        |       ,c_salutation
        |       ,c_preferred_cust_flag
        |       ,ss_ticket_number
        |       ,cnt from
        |   (select ss_ticket_number
        |          ,ss_customer_sk
        |          ,count(*) cnt
        |    from store_sales,date_dim,store,household_demographics
        |    where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |    and store_sales.ss_store_sk = store.s_store_sk
        |    and store_sales.ss_hdemo_sk = household_demographics.hd_demo_sk
        |    and (date_dim.d_dom between 1 and 3 or date_dim.d_dom between 25 and 28)
        |    and (household_demographics.hd_buy_potential = '>10000' or
        |         household_demographics.hd_buy_potential = 'Unknown')
        |    and household_demographics.hd_vehicle_count > 0
        |    and (case when household_demographics.hd_vehicle_count > 0
        |	then household_demographics.hd_dep_count/ household_demographics.hd_vehicle_count
        |	else null
        |	end)  > 1.2
        |    and date_dim.d_year in (1998,1998+1,1998+2)
        |    and store.s_county in ('Williamson County','Williamson County','Williamson County','Williamson County',
        |                           'Williamson County','Williamson County','Williamson County','Williamson County')
        |    group by ss_ticket_number,ss_customer_sk) dn,customer
        |    where ss_customer_sk = c_customer_sk
        |      and cnt between 15 and 20
        |    order by c_last_name,c_first_name,c_salutation,c_preferred_cust_flag desc, ss_ticket_number
        |""".stripMargin,

    "Q35" ->
      """
        |select
        |  ca_state,
        |  cd_gender,
        |  cd_marital_status,
        |  cd_dep_count,
        |  count(*) cnt1,
        |  avg(cd_dep_count),
        |  max(cd_dep_count),
        |  sum(cd_dep_count),
        |  cd_dep_employed_count,
        |  count(*) cnt2,
        |  avg(cd_dep_employed_count),
        |  max(cd_dep_employed_count),
        |  sum(cd_dep_employed_count),
        |  cd_dep_college_count,
        |  count(*) cnt3,
        |  avg(cd_dep_college_count),
        |  max(cd_dep_college_count),
        |  sum(cd_dep_college_count)
        | from
        |  customer c,customer_address ca,customer_demographics
        | where
        |  c.c_current_addr_sk = ca.ca_address_sk and
        |  cd_demo_sk = c.c_current_cdemo_sk and
        |  exists (select *
        |          from store_sales,date_dim
        |          where c.c_customer_sk = ss_customer_sk and
        |                ss_sold_date_sk = d_date_sk and
        |                d_year = 1999 and
        |                d_qoy < 4) and
        |   (exists (select *
        |            from web_sales,date_dim
        |            where c.c_customer_sk = ws_bill_customer_sk and
        |                  ws_sold_date_sk = d_date_sk and
        |                  d_year = 1999 and
        |                  d_qoy < 4) or
        |    exists (select *
        |            from catalog_sales,date_dim
        |            where c.c_customer_sk = cs_ship_customer_sk and
        |                  cs_sold_date_sk = d_date_sk and
        |                  d_year = 1999 and
        |                  d_qoy < 4))
        | group by ca_state,
        |          cd_gender,
        |          cd_marital_status,
        |          cd_dep_count,
        |          cd_dep_employed_count,
        |          cd_dep_college_count
        | order by ca_state,
        |          cd_gender,
        |          cd_marital_status,
        |          cd_dep_count,
        |          cd_dep_employed_count,
        |          cd_dep_college_count
        |
        |""".stripMargin,

    "Q36" ->
      """
        |select
        |    sum(ss_net_profit)/sum(ss_ext_sales_price) as gross_margin
        |   ,i_category
        |   ,i_class
        |   ,grouping(i_category)+grouping(i_class) as lochierarchy
        |   ,rank() over (
        | 	partition by grouping(i_category)+grouping(i_class),
        | 	case when grouping(i_class) = 0 then i_category end
        | 	order by sum(ss_net_profit)/sum(ss_ext_sales_price) asc) as rank_within_parent
        | from
        |    store_sales
        |   ,date_dim       d1
        |   ,item
        |   ,store
        | where
        |    d1.d_year = 2000
        | and d1.d_date_sk = ss_sold_date_sk
        | and i_item_sk  = ss_item_sk
        | and s_store_sk  = ss_store_sk
        | and s_state in ('TN','TN','TN','TN',
        |                 'TN','TN','TN','TN')
        | group by rollup(i_category,i_class)
        | order by
        |   lochierarchy desc
        |  ,case when lochierarchy = 0 then i_category end
        |  ,rank_within_parent
        |""".stripMargin,

    "Q38" ->
      """
        |select count(*) from (
        |    select distinct c_last_name, c_first_name, d_date
        |    from store_sales, date_dim, customer
        |          where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |      and store_sales.ss_customer_sk = customer.c_customer_sk
        |      and d_month_seq between 1212 and 1212 + 11
        |  intersect
        |    select distinct c_last_name, c_first_name, d_date
        |    from catalog_sales, date_dim, customer
        |          where catalog_sales.cs_sold_date_sk = date_dim.d_date_sk
        |      and catalog_sales.cs_bill_customer_sk = customer.c_customer_sk
        |      and d_month_seq between 1212 and 1212 + 11
        |  intersect
        |    select distinct c_last_name, c_first_name, d_date
        |    from web_sales, date_dim, customer
        |          where web_sales.ws_sold_date_sk = date_dim.d_date_sk
        |      and web_sales.ws_bill_customer_sk = customer.c_customer_sk
        |      and d_month_seq between 1212 and 1212 + 11
        |) hot_cust
        |""".stripMargin,

    "Q39" ->
      """
        |with inv as
        |(select w_warehouse_name,w_warehouse_sk,i_item_sk,d_moy
        |       ,stdev,mean, case mean when 0 then null else stdev/mean end cov
        | from(select w_warehouse_name,w_warehouse_sk,i_item_sk,d_moy
        |            ,stddev_samp(inv_quantity_on_hand) stdev,avg(inv_quantity_on_hand) mean
        |      from inventory
        |          ,item
        |          ,warehouse
        |          ,date_dim
        |      where inv_item_sk = i_item_sk
        |        and inv_warehouse_sk = w_warehouse_sk
        |        and inv_date_sk = d_date_sk
        |        and d_year =1998
        |      group by w_warehouse_name,w_warehouse_sk,i_item_sk,d_moy) foo
        | where case mean when 0 then 0 else stdev/mean end > 1)
        |select
        | inv1.w_warehouse_sk as inv1_w_warehouse_sk,
        | inv1.i_item_sk as inv1_i_item_sk,
        | inv1.d_moy as inv1_d_moy,
        | inv1.mean as inv1_mean,
        | inv1.cov as inv1_cov,
        | inv2.w_warehouse_sk as inv2_w_warehouse_sk,
        | inv2.i_item_sk as inv2_i_item_sk,
        | inv2.d_moy as inv2_d_moy,
        | inv2.mean as inv2_mean,
        | inv2.cov as inv2_cov
        |from inv inv1,inv inv2
        |where inv1.i_item_sk = inv2.i_item_sk
        |  and inv1.w_warehouse_sk =  inv2.w_warehouse_sk
        |  and inv1.d_moy=4
        |  and inv2.d_moy=4+1
        |  and inv1.cov > 1.5
        |order by inv1.w_warehouse_sk,inv1.i_item_sk,inv1.d_moy,inv1.mean,inv1.cov
        |        ,inv2.d_moy,inv2.mean, inv2.cov
        |""".stripMargin,

    "Q41" ->
      """
        |select distinct(i_product_name)
        | from item i1
        | where i_manufact_id between 742 and 742+40
        |   and (select count(*) as item_cnt
        |        from item
        |        where (i_manufact = i1.i_manufact and
        |        ((i_category = 'Women' and
        |        (i_color = 'orchid' or i_color = 'papaya') and
        |        (i_units = 'Pound' or i_units = 'Lb') and
        |        (i_size = 'petite' or i_size = 'medium')
        |        ) or
        |        (i_category = 'Women' and
        |        (i_color = 'burlywood' or i_color = 'navy') and
        |        (i_units = 'Bundle' or i_units = 'Each') and
        |        (i_size = 'N/A' or i_size = 'extra large')
        |        ) or
        |        (i_category = 'Men' and
        |        (i_color = 'bisque' or i_color = 'azure') and
        |        (i_units = 'N/A' or i_units = 'Tsp') and
        |        (i_size = 'small' or i_size = 'large')
        |        ) or
        |        (i_category = 'Men' and
        |        (i_color = 'chocolate' or i_color = 'cornflower') and
        |        (i_units = 'Bunch' or i_units = 'Gross') and
        |        (i_size = 'petite' or i_size = 'medium')
        |        ))) or
        |       (i_manufact = i1.i_manufact and
        |        ((i_category = 'Women' and
        |        (i_color = 'salmon' or i_color = 'midnight') and
        |        (i_units = 'Oz' or i_units = 'Box') and
        |        (i_size = 'petite' or i_size = 'medium')
        |        ) or
        |        (i_category = 'Women' and
        |        (i_color = 'snow' or i_color = 'steel') and
        |        (i_units = 'Carton' or i_units = 'Tbl') and
        |        (i_size = 'N/A' or i_size = 'extra large')
        |        ) or
        |        (i_category = 'Men' and
        |        (i_color = 'purple' or i_color = 'gainsboro') and
        |        (i_units = 'Dram' or i_units = 'Unknown') and
        |        (i_size = 'small' or i_size = 'large')
        |        ) or
        |        (i_category = 'Men' and
        |        (i_color = 'metallic' or i_color = 'forest') and
        |        (i_units = 'Gram' or i_units = 'Ounce') and
        |        (i_size = 'petite' or i_size = 'medium')
        |        )))) > 0
        | order by i_product_name
        |""".stripMargin,

    "Q42" ->
      """
        |select dt.d_year
        | 	,item.i_category_id
        | 	,item.i_category
        | 	,sum(ss_ext_sales_price)
        | from 	date_dim dt
        | 	,store_sales
        | 	,item
        | where dt.d_date_sk = store_sales.ss_sold_date_sk
        | 	and store_sales.ss_item_sk = item.i_item_sk
        | 	and item.i_manager_id = 1
        | 	and dt.d_moy=12
        | 	and dt.d_year=1998
        | group by 	dt.d_year
        | 		,item.i_category_id
        | 		,item.i_category
        | order by       sum(ss_ext_sales_price) desc,dt.d_year
        | 		,item.i_category_id
        | 		,item.i_category
        |""".stripMargin,

    "Q43" ->
      """
        |select s_store_name, s_store_id,
        |        sum(case when (d_day_name='Sunday') then ss_sales_price else null end) sun_sales,
        |        sum(case when (d_day_name='Monday') then ss_sales_price else null end) mon_sales,
        |        sum(case when (d_day_name='Tuesday') then ss_sales_price else  null end) tue_sales,
        |        sum(case when (d_day_name='Wednesday') then ss_sales_price else null end) wed_sales,
        |        sum(case when (d_day_name='Thursday') then ss_sales_price else null end) thu_sales,
        |        sum(case when (d_day_name='Friday') then ss_sales_price else null end) fri_sales,
        |        sum(case when (d_day_name='Saturday') then ss_sales_price else null end) sat_sales
        | from date_dim, store_sales, store
        | where d_date_sk = ss_sold_date_sk and
        |       s_store_sk = ss_store_sk and
        |       s_gmt_offset = -5 and
        |       d_year = 1998
        | group by s_store_name, s_store_id
        | order by s_store_name, s_store_id,sun_sales,mon_sales,tue_sales,wed_sales,thu_sales,fri_sales,sat_sales
        |""".stripMargin,

    "Q45" ->
      """
        |select ca_zip, ca_county, sum(ws_sales_price)
        | from web_sales, customer, customer_address, date_dim, item
        | where ws_bill_customer_sk = c_customer_sk
        | 	and c_current_addr_sk = ca_address_sk
        | 	and ws_item_sk = i_item_sk
        | 	and ( substr(ca_zip,1,5) in ('85669', '86197','88274','83405','86475', '85392', '85460', '80348', '81792')
        | 	      or
        | 	      i_item_id in (select i_item_id
        |                             from item
        |                             where i_item_sk in (2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
        |                             )
        | 	    )
        | 	and ws_sold_date_sk = d_date_sk
        | 	and d_qoy = 2 and d_year = 2000
        | group by ca_zip, ca_county
        | order by ca_zip, ca_county
        |""".stripMargin,

    "Q46" ->
      """
        |select c_last_name
        |       ,c_first_name
        |       ,ca_city
        |       ,bought_city
        |       ,ss_ticket_number
        |       ,amt,profit
        | from
        |   (select ss_ticket_number
        |          ,ss_customer_sk
        |          ,ca_city bought_city
        |          ,sum(ss_coupon_amt) amt
        |          ,sum(ss_net_profit) profit
        |    from store_sales,date_dim,store,household_demographics,customer_address
        |    where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |    and store_sales.ss_store_sk = store.s_store_sk
        |    and store_sales.ss_hdemo_sk = household_demographics.hd_demo_sk
        |    and store_sales.ss_addr_sk = customer_address.ca_address_sk
        |    and (household_demographics.hd_dep_count = 5 or
        |         household_demographics.hd_vehicle_count= 3)
        |    and date_dim.d_dow in (6,0)
        |    and date_dim.d_year in (1999,1999+1,1999+2)
        |    and store.s_city in ('Midway','Fairview','Fairview','Midway','Fairview')
        |    group by ss_ticket_number,ss_customer_sk,ss_addr_sk,ca_city) dn,customer,customer_address current_addr
        |    where ss_customer_sk = c_customer_sk
        |      and customer.c_current_addr_sk = current_addr.ca_address_sk
        |      and current_addr.ca_city <> bought_city
        |  order by c_last_name
        |          ,c_first_name
        |          ,ca_city
        |          ,bought_city
        |          ,ss_ticket_number
        |""".stripMargin,

    "Q47" ->
      """
        |with v1 as(
        | select i_category, i_brand,
        |        s_store_name, s_company_name,
        |        d_year, d_moy,
        |        sum(ss_sales_price) sum_sales,
        |        avg(sum(ss_sales_price)) over
        |          (partition by i_category, i_brand,
        |                     s_store_name, s_company_name, d_year)
        |          avg_monthly_sales,
        |        rank() over
        |          (partition by i_category, i_brand,
        |                     s_store_name, s_company_name
        |           order by d_year, d_moy) rn
        | from item, store_sales, date_dim, store
        | where ss_item_sk = i_item_sk and
        |       ss_sold_date_sk = d_date_sk and
        |       ss_store_sk = s_store_sk and
        |       (
        |         d_year = 2000 or
        |         ( d_year = 2000-1 and d_moy =12) or
        |         ( d_year = 2000+1 and d_moy =1)
        |       )
        | group by i_category, i_brand,
        |          s_store_name, s_company_name,
        |          d_year, d_moy),
        | v2 as(
        | select v1.i_category, v1.i_brand
        |        ,v1.d_year, v1.d_moy
        |        ,v1.avg_monthly_sales
        |        ,v1.sum_sales, v1_lag.sum_sales psum, v1_lead.sum_sales nsum
        | from v1, v1 v1_lag, v1 v1_lead
        | where v1.i_category = v1_lag.i_category and
        |       v1.i_category = v1_lead.i_category and
        |       v1.i_brand = v1_lag.i_brand and
        |       v1.i_brand = v1_lead.i_brand and
        |       v1.s_store_name = v1_lag.s_store_name and
        |       v1.s_store_name = v1_lead.s_store_name and
        |       v1.s_company_name = v1_lag.s_company_name and
        |       v1.s_company_name = v1_lead.s_company_name and
        |       v1.rn = v1_lag.rn + 1 and
        |       v1.rn = v1_lead.rn - 1)
        |  select *
        | from v2
        | where  d_year = 2000 and
        |        avg_monthly_sales > 0 and
        |        case when avg_monthly_sales > 0 then abs(sum_sales - avg_monthly_sales) / avg_monthly_sales else null end > 0.1
        | order by sum_sales - avg_monthly_sales, nsum
        |""".stripMargin,

    "Q48" ->
      """
        |select sum (ss_quantity)
        | from store_sales, store, customer_demographics, customer_address, date_dim
        | where s_store_sk = ss_store_sk
        | and  ss_sold_date_sk = d_date_sk and d_year = 1998
        | and
        | (
        |  (
        |   cd_demo_sk = ss_cdemo_sk
        |   and
        |   cd_marital_status = 'M'
        |   and
        |   cd_education_status = '4 yr Degree'
        |   and
        |   ss_sales_price between 100.00 and 150.00
        |   )
        | or
        |  (
        |  cd_demo_sk = ss_cdemo_sk
        |   and
        |   cd_marital_status = 'D'
        |   and
        |   cd_education_status = 'Primary'
        |   and
        |   ss_sales_price between 50.00 and 100.00
        |  )
        | or
        | (
        |  cd_demo_sk = ss_cdemo_sk
        |  and
        |   cd_marital_status = 'U'
        |   and
        |   cd_education_status = 'Advanced Degree'
        |   and
        |   ss_sales_price between 150.00 and 200.00
        | )
        | )
        | and
        | (
        |  (
        |  ss_addr_sk = ca_address_sk
        |  and
        |  ca_country = 'United States'
        |  and
        |  ca_state in ('KY', 'GA', 'NM')
        |  and ss_net_profit between 0 and 2000
        |  )
        | or
        |  (ss_addr_sk = ca_address_sk
        |  and
        |  ca_country = 'United States'
        |  and
        |  ca_state in ('MT', 'OR', 'IN')
        |  and ss_net_profit between 150 and 3000
        |  )
        | or
        |  (ss_addr_sk = ca_address_sk
        |  and
        |  ca_country = 'United States'
        |  and
        |  ca_state in ('WI', 'MO', 'WV')
        |  and ss_net_profit between 50 and 25000
        |  )
        | )
        |""".stripMargin,

    "Q50" ->
      """
        |select
        |   s_store_name
        |  ,s_company_id
        |  ,s_street_number
        |  ,s_street_name
        |  ,s_street_type
        |  ,s_suite_number
        |  ,s_city
        |  ,s_county
        |  ,s_state
        |  ,s_zip
        |  ,sum(case when (sr_returned_date_sk - ss_sold_date_sk <= 30 ) then 1 else 0 end)  as _30_days
        |  ,sum(case when (sr_returned_date_sk - ss_sold_date_sk > 30) and
        |                 (sr_returned_date_sk - ss_sold_date_sk <= 60) then 1 else 0 end )  as _31_60_days
        |  ,sum(case when (sr_returned_date_sk - ss_sold_date_sk > 60) and
        |                 (sr_returned_date_sk - ss_sold_date_sk <= 90) then 1 else 0 end)  as _61_90_days
        |  ,sum(case when (sr_returned_date_sk - ss_sold_date_sk > 90) and
        |                 (sr_returned_date_sk - ss_sold_date_sk <= 120) then 1 else 0 end)  as _91_120_days
        |  ,sum(case when (sr_returned_date_sk - ss_sold_date_sk  > 120) then 1 else 0 end)  as _120_days
        |from
        |   store_sales
        |  ,store_returns
        |  ,store
        |  ,date_dim d1
        |  ,date_dim d2
        |where
        |    d2.d_year = 2000
        |and d2.d_moy  = 9
        |and ss_ticket_number = sr_ticket_number
        |and ss_item_sk = sr_item_sk
        |and ss_sold_date_sk   = d1.d_date_sk
        |and sr_returned_date_sk   = d2.d_date_sk
        |and ss_customer_sk = sr_customer_sk
        |and ss_store_sk = s_store_sk
        |group by
        |   s_store_name
        |  ,s_company_id
        |  ,s_street_number
        |  ,s_street_name
        |  ,s_street_type
        |  ,s_suite_number
        |  ,s_city
        |  ,s_county
        |  ,s_state
        |  ,s_zip
        |order by s_store_name
        |        ,s_company_id
        |        ,s_street_number
        |        ,s_street_name
        |        ,s_street_type
        |        ,s_suite_number
        |        ,s_city
        |        ,s_county
        |        ,s_state
        |        ,s_zip
        |""".stripMargin,

    "Q51" ->
      """
        |WITH web_v1 as (
        |select
        |  ws_item_sk item_sk, d_date,
        |  sum(sum(ws_sales_price))
        |      over (partition by ws_item_sk order by d_date rows between unbounded preceding and current row) cume_sales
        |from web_sales
        |    ,date_dim
        |where ws_sold_date_sk=d_date_sk
        |  and d_month_seq between 1212 and 1212+11
        |  and ws_item_sk is not NULL
        |group by ws_item_sk, d_date),
        |store_v1 as (
        |select
        |  ss_item_sk item_sk, d_date,
        |  sum(sum(ss_sales_price))
        |      over (partition by ss_item_sk order by d_date rows between unbounded preceding and current row) cume_sales
        |from store_sales
        |    ,date_dim
        |where ss_sold_date_sk=d_date_sk
        |  and d_month_seq between 1212 and 1212+11
        |  and ss_item_sk is not NULL
        |group by ss_item_sk, d_date)
        | select *
        |from (select item_sk
        |     ,d_date
        |     ,web_sales
        |     ,store_sales
        |     ,max(web_sales)
        |         over (partition by item_sk order by d_date rows between unbounded preceding and current row) web_cumulative
        |     ,max(store_sales)
        |         over (partition by item_sk order by d_date rows between unbounded preceding and current row) store_cumulative
        |     from (select case when web.item_sk is not null then web.item_sk else store.item_sk end item_sk
        |                 ,case when web.d_date is not null then web.d_date else store.d_date end d_date
        |                 ,web.cume_sales web_sales
        |                 ,store.cume_sales store_sales
        |           from web_v1 web full outer join store_v1 store on (web.item_sk = store.item_sk
        |                                                          and web.d_date = store.d_date)
        |          )x )y
        |where web_cumulative > store_cumulative
        |order by item_sk
        |        ,d_date
        |""".stripMargin,

    "Q52" ->
      """
        |select dt.d_year
        | 	,item.i_brand_id brand_id
        | 	,item.i_brand brand
        | 	,sum(ss_ext_sales_price) ext_price
        | from date_dim dt
        |     ,store_sales
        |     ,item
        | where dt.d_date_sk = store_sales.ss_sold_date_sk
        |    and store_sales.ss_item_sk = item.i_item_sk
        |    and item.i_manager_id = 1
        |    and dt.d_moy=12
        |    and dt.d_year=1998
        | group by dt.d_year
        | 	,item.i_brand
        | 	,item.i_brand_id
        | order by dt.d_year
        | 	,ext_price desc
        | 	,brand_id
        |""".stripMargin,

    "Q53" ->
      """
        |select * from
        |(select i_manufact_id,
        |sum(ss_sales_price) sum_sales,
        |avg(sum(ss_sales_price)) over (partition by i_manufact_id) avg_quarterly_sales
        |from item, store_sales, date_dim, store
        |where ss_item_sk = i_item_sk and
        |ss_sold_date_sk = d_date_sk and
        |ss_store_sk = s_store_sk and
        |d_month_seq in (1212,1212+1,1212+2,1212+3,1212+4,1212+5,1212+6,1212+7,1212+8,1212+9,1212+10,1212+11) and
        |((i_category in ('Books','Children','Electronics') and
        |i_class in ('personal','portable','reference','self-help') and
        |i_brand in ('scholaramalgamalg #14','scholaramalgamalg #7',
        |		'exportiunivamalg #9','scholaramalgamalg #9'))
        |or(i_category in ('Women','Music','Men') and
        |i_class in ('accessories','classical','fragrances','pants') and
        |i_brand in ('amalgimporto #1','edu packscholar #1','exportiimporto #1',
        |		'importoamalg #1')))
        |group by i_manufact_id, d_qoy ) tmp1
        |where case when avg_quarterly_sales > 0
        |	then abs (sum_sales - avg_quarterly_sales)/ avg_quarterly_sales
        |	else null end > 0.1
        |order by avg_quarterly_sales,
        |	 sum_sales,
        |	 i_manufact_id
        |""".stripMargin,

    "Q54" ->
      """
        |with my_customers as (
        | select distinct c_customer_sk
        |        , c_current_addr_sk
        | from
        |        ( select cs_sold_date_sk sold_date_sk,
        |                 cs_bill_customer_sk customer_sk,
        |                 cs_item_sk item_sk
        |          from   catalog_sales
        |          union all
        |          select ws_sold_date_sk sold_date_sk,
        |                 ws_bill_customer_sk customer_sk,
        |                 ws_item_sk item_sk
        |          from   web_sales
        |         ) cs_or_ws_sales,
        |         item,
        |         date_dim,
        |         customer
        | where   sold_date_sk = d_date_sk
        |         and item_sk = i_item_sk
        |         and i_category = 'Jewelry'
        |         and i_class = 'consignment'
        |         and c_customer_sk = cs_or_ws_sales.customer_sk
        |         and d_moy = 3
        |         and d_year = 1999
        | )
        | , my_revenue as (
        | select c_customer_sk,
        |        sum(ss_ext_sales_price) as revenue
        | from   my_customers,
        |        store_sales,
        |        customer_address,
        |        store,
        |        date_dim
        | where  c_current_addr_sk = ca_address_sk
        |        and ca_county = s_county
        |        and ca_state = s_state
        |        and ss_sold_date_sk = d_date_sk
        |        and c_customer_sk = ss_customer_sk
        |        and d_month_seq between (select distinct d_month_seq+1
        |                                 from   date_dim where d_year = 1999 and d_moy = 3)
        |                           and  (select distinct d_month_seq+3
        |                                 from   date_dim where d_year = 1999 and d_moy = 3)
        | group by c_customer_sk
        | )
        | , segments as
        | (select cast((revenue/50) as int) as segment
        |  from   my_revenue
        | )
        |  select segment, count(*) as num_customers, segment*50 as segment_base
        | from segments
        | group by segment
        | order by segment, num_customers
        |""".stripMargin,

    "Q55" ->
      """
        |select i_brand_id brand_id, i_brand brand,
        | 	sum(ss_ext_sales_price) ext_price
        | from date_dim, store_sales, item
        | where d_date_sk = ss_sold_date_sk
        | 	and ss_item_sk = i_item_sk
        | 	and i_manager_id=36
        | 	and d_moy=12
        | 	and d_year=2001
        | group by i_brand, i_brand_id
        | order by ext_price desc, i_brand_id
        |""".stripMargin,

    "Q56" ->
      """
        |with ss as (
        | select i_item_id,sum(ss_ext_sales_price) total_sales
        | from
        | 	store_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where i_item_id in (select
        |     i_item_id
        |from item
        |where i_color in ('orchid','chiffon','lace'))
        | and     ss_item_sk              = i_item_sk
        | and     ss_sold_date_sk         = d_date_sk
        | and     d_year                  = 2000
        | and     d_moy                   = 1
        | and     ss_addr_sk              = ca_address_sk
        | and     ca_gmt_offset           = -8
        | group by i_item_id),
        | cs as (
        | select i_item_id,sum(cs_ext_sales_price) total_sales
        | from
        | 	catalog_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_item_id               in (select
        |  i_item_id
        |from item
        |where i_color in ('orchid','chiffon','lace'))
        | and     cs_item_sk              = i_item_sk
        | and     cs_sold_date_sk         = d_date_sk
        | and     d_year                  = 2000
        | and     d_moy                   = 1
        | and     cs_bill_addr_sk         = ca_address_sk
        | and     ca_gmt_offset           = -8
        | group by i_item_id),
        | ws as (
        | select i_item_id,sum(ws_ext_sales_price) total_sales
        | from
        | 	web_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_item_id               in (select
        |  i_item_id
        |from item
        |where i_color in ('orchid','chiffon','lace'))
        | and     ws_item_sk              = i_item_sk
        | and     ws_sold_date_sk         = d_date_sk
        | and     d_year                  = 2000
        | and     d_moy                   = 1
        | and     ws_bill_addr_sk         = ca_address_sk
        | and     ca_gmt_offset           = -8
        | group by i_item_id)
        |  select i_item_id ,sum(total_sales) total_sales
        | from  (select * from ss
        |        union all
        |        select * from cs
        |        union all
        |        select * from ws) tmp1
        | group by i_item_id
        | order by total_sales,
        |          i_item_id
        |""".stripMargin,

    "Q57" ->
      """
        |with v1 as(
        | select i_category, i_brand,
        |        cc_name,
        |        d_year, d_moy,
        |        sum(cs_sales_price) sum_sales,
        |        avg(sum(cs_sales_price)) over
        |          (partition by i_category, i_brand,
        |                     cc_name, d_year)
        |          avg_monthly_sales,
        |        rank() over
        |          (partition by i_category, i_brand,
        |                     cc_name
        |           order by d_year, d_moy) rn
        | from item, catalog_sales, date_dim, call_center
        | where cs_item_sk = i_item_sk and
        |       cs_sold_date_sk = d_date_sk and
        |       cc_call_center_sk= cs_call_center_sk and
        |       (
        |         d_year = 2000 or
        |         ( d_year = 2000-1 and d_moy =12) or
        |         ( d_year = 2000+1 and d_moy =1)
        |       )
        | group by i_category, i_brand,
        |          cc_name , d_year, d_moy),
        | v2 as(
        | select v1.cc_name
        |        ,v1.d_year, v1.d_moy
        |        ,v1.avg_monthly_sales
        |        ,v1.sum_sales, v1_lag.sum_sales psum, v1_lead.sum_sales nsum
        | from v1, v1 v1_lag, v1 v1_lead
        | where v1.i_category = v1_lag.i_category and
        |       v1.i_category = v1_lead.i_category and
        |       v1.i_brand = v1_lag.i_brand and
        |       v1.i_brand = v1_lead.i_brand and
        |       v1. cc_name = v1_lag. cc_name and
        |       v1. cc_name = v1_lead. cc_name and
        |       v1.rn = v1_lag.rn + 1 and
        |       v1.rn = v1_lead.rn - 1)
        |  select *
        | from v2
        | where  d_year = 2000 and
        |        avg_monthly_sales > 0 and
        |        case when avg_monthly_sales > 0 then abs(sum_sales - avg_monthly_sales) / avg_monthly_sales else null end > 0.1
        | order by sum_sales - avg_monthly_sales, nsum
        |""".stripMargin,

    "Q58" ->
      """
        |with ss_items as
        | (select i_item_id item_id
        |        ,sum(ss_ext_sales_price) ss_item_rev
        | from store_sales
        |     ,item
        |     ,date_dim
        | where ss_item_sk = i_item_sk
        |   and d_date in (select d_date
        |                  from date_dim
        |                  where d_week_seq = (select d_week_seq
        |                                      from date_dim
        |                                      where d_date = '1998-02-19'))
        |   and ss_sold_date_sk   = d_date_sk
        | group by i_item_id),
        | cs_items as
        | (select i_item_id item_id
        |        ,sum(cs_ext_sales_price) cs_item_rev
        |  from catalog_sales
        |      ,item
        |      ,date_dim
        | where cs_item_sk = i_item_sk
        |  and  d_date in (select d_date
        |                  from date_dim
        |                  where d_week_seq = (select d_week_seq
        |                                      from date_dim
        |                                      where d_date = '1998-02-19'))
        |  and  cs_sold_date_sk = d_date_sk
        | group by i_item_id),
        | ws_items as
        | (select i_item_id item_id
        |        ,sum(ws_ext_sales_price) ws_item_rev
        |  from web_sales
        |      ,item
        |      ,date_dim
        | where ws_item_sk = i_item_sk
        |  and  d_date in (select d_date
        |                  from date_dim
        |                  where d_week_seq =(select d_week_seq
        |                                     from date_dim
        |                                     where d_date = '1998-02-19'))
        |  and ws_sold_date_sk   = d_date_sk
        | group by i_item_id)
        |  select ss_items.item_id
        |       ,ss_item_rev
        |       ,ss_item_rev/((ss_item_rev+cs_item_rev+ws_item_rev)/3) * 100 ss_dev
        |       ,cs_item_rev
        |       ,cs_item_rev/((ss_item_rev+cs_item_rev+ws_item_rev)/3) * 100 cs_dev
        |       ,ws_item_rev
        |       ,ws_item_rev/((ss_item_rev+cs_item_rev+ws_item_rev)/3) * 100 ws_dev
        |       ,(ss_item_rev+cs_item_rev+ws_item_rev)/3 average
        | from ss_items,cs_items,ws_items
        | where ss_items.item_id=cs_items.item_id
        |   and ss_items.item_id=ws_items.item_id
        |   and ss_item_rev between 0.9 * cs_item_rev and 1.1 * cs_item_rev
        |   and ss_item_rev between 0.9 * ws_item_rev and 1.1 * ws_item_rev
        |   and cs_item_rev between 0.9 * ss_item_rev and 1.1 * ss_item_rev
        |   and cs_item_rev between 0.9 * ws_item_rev and 1.1 * ws_item_rev
        |   and ws_item_rev between 0.9 * ss_item_rev and 1.1 * ss_item_rev
        |   and ws_item_rev between 0.9 * cs_item_rev and 1.1 * cs_item_rev
        | order by item_id
        |         ,ss_item_rev
        |""".stripMargin,

    "Q59" ->
      """
        |with wss as
        | (select d_week_seq,
        |        ss_store_sk,
        |        sum(case when (d_day_name='Sunday') then ss_sales_price else null end) sun_sales,
        |        sum(case when (d_day_name='Monday') then ss_sales_price else null end) mon_sales,
        |        sum(case when (d_day_name='Tuesday') then ss_sales_price else  null end) tue_sales,
        |        sum(case when (d_day_name='Wednesday') then ss_sales_price else null end) wed_sales,
        |        sum(case when (d_day_name='Thursday') then ss_sales_price else null end) thu_sales,
        |        sum(case when (d_day_name='Friday') then ss_sales_price else null end) fri_sales,
        |        sum(case when (d_day_name='Saturday') then ss_sales_price else null end) sat_sales
        | from store_sales,date_dim
        | where d_date_sk = ss_sold_date_sk
        | group by d_week_seq,ss_store_sk
        | )
        |  select s_store_name1,s_store_id1,d_week_seq1
        |       ,sun_sales1/sun_sales2,mon_sales1/mon_sales2
        |       ,tue_sales1/tue_sales2,wed_sales1/wed_sales2,thu_sales1/thu_sales2
        |       ,fri_sales1/fri_sales2,sat_sales1/sat_sales2
        | from
        | (select s_store_name s_store_name1,wss.d_week_seq d_week_seq1
        |        ,s_store_id s_store_id1,sun_sales sun_sales1
        |        ,mon_sales mon_sales1,tue_sales tue_sales1
        |        ,wed_sales wed_sales1,thu_sales thu_sales1
        |        ,fri_sales fri_sales1,sat_sales sat_sales1
        |  from wss,store,date_dim d
        |  where d.d_week_seq = wss.d_week_seq and
        |        ss_store_sk = s_store_sk and
        |        d_month_seq between 1185 and 1185 + 11) y,
        | (select s_store_name s_store_name2,wss.d_week_seq d_week_seq2
        |        ,s_store_id s_store_id2,sun_sales sun_sales2
        |        ,mon_sales mon_sales2,tue_sales tue_sales2
        |        ,wed_sales wed_sales2,thu_sales thu_sales2
        |        ,fri_sales fri_sales2,sat_sales sat_sales2
        |  from wss,store,date_dim d
        |  where d.d_week_seq = wss.d_week_seq and
        |        ss_store_sk = s_store_sk and
        |        d_month_seq between 1185+ 12 and 1185 + 23) x
        | where s_store_id1=s_store_id2
        |   and d_week_seq1=d_week_seq2-52
        | order by s_store_name1,s_store_id1,d_week_seq1
        |""".stripMargin,

    "Q60" ->
      """
        |with ss as (
        | select
        |          i_item_id,sum(ss_ext_sales_price) total_sales
        | from
        | 	store_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_item_id in (select
        |  i_item_id
        |from
        | item
        |where i_category in ('Children'))
        | and     ss_item_sk              = i_item_sk
        | and     ss_sold_date_sk         = d_date_sk
        | and     d_year                  = 1999
        | and     d_moy                   = 9
        | and     ss_addr_sk              = ca_address_sk
        | and     ca_gmt_offset           = -6
        | group by i_item_id),
        | cs as (
        | select
        |          i_item_id,sum(cs_ext_sales_price) total_sales
        | from
        | 	catalog_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_item_id               in (select
        |  i_item_id
        |from
        | item
        |where i_category in ('Children'))
        | and     cs_item_sk              = i_item_sk
        | and     cs_sold_date_sk         = d_date_sk
        | and     d_year                  = 1999
        | and     d_moy                   = 9
        | and     cs_bill_addr_sk         = ca_address_sk
        | and     ca_gmt_offset           = -6
        | group by i_item_id),
        | ws as (
        | select
        |          i_item_id,sum(ws_ext_sales_price) total_sales
        | from
        | 	web_sales,
        | 	date_dim,
        |         customer_address,
        |         item
        | where
        |         i_item_id               in (select
        |  i_item_id
        |from
        | item
        |where i_category in ('Children'))
        | and     ws_item_sk              = i_item_sk
        | and     ws_sold_date_sk         = d_date_sk
        | and     d_year                  = 1999
        | and     d_moy                   = 9
        | and     ws_bill_addr_sk         = ca_address_sk
        | and     ca_gmt_offset           = -6
        | group by i_item_id)
        |  select
        |  i_item_id
        |,sum(total_sales) total_sales
        | from  (select * from ss
        |        union all
        |        select * from cs
        |        union all
        |        select * from ws) tmp1
        | group by i_item_id
        | order by i_item_id
        |      ,total_sales
        |""".stripMargin,

    "Q62" ->
      """
        |select
        |   substr(w_warehouse_name,1,20)
        |  ,sm_type
        |  ,web_name
        |  ,sum(case when (ws_ship_date_sk - ws_sold_date_sk <= 30 ) then 1 else 0 end)  as _30_days
        |  ,sum(case when (ws_ship_date_sk - ws_sold_date_sk > 30) and
        |                 (ws_ship_date_sk - ws_sold_date_sk <= 60) then 1 else 0 end )  as _31_60_days
        |  ,sum(case when (ws_ship_date_sk - ws_sold_date_sk > 60) and
        |                 (ws_ship_date_sk - ws_sold_date_sk <= 90) then 1 else 0 end)  as _61_90_days
        |  ,sum(case when (ws_ship_date_sk - ws_sold_date_sk > 90) and
        |                 (ws_ship_date_sk - ws_sold_date_sk <= 120) then 1 else 0 end)  as _91_120_days
        |  ,sum(case when (ws_ship_date_sk - ws_sold_date_sk  > 120) then 1 else 0 end)  as _120_days
        |from
        |   web_sales
        |  ,warehouse
        |  ,ship_mode
        |  ,web_site
        |  ,date_dim
        |where
        |    d_month_seq between 1212 and 1212 + 11
        |and ws_ship_date_sk   = d_date_sk
        |and ws_warehouse_sk   = w_warehouse_sk
        |and ws_ship_mode_sk   = sm_ship_mode_sk
        |and ws_web_site_sk    = web_site_sk
        |group by
        |   substr(w_warehouse_name,1,20)
        |  ,sm_type
        |  ,web_name
        |order by substr(w_warehouse_name,1,20)
        |        ,sm_type
        |       ,web_name
        |""".stripMargin,

    "Q63" ->
      """
        |select *
        |from (select i_manager_id
        |             ,sum(ss_sales_price) sum_sales
        |             ,avg(sum(ss_sales_price)) over (partition by i_manager_id) avg_monthly_sales
        |      from item
        |          ,store_sales
        |          ,date_dim
        |          ,store
        |      where ss_item_sk = i_item_sk
        |        and ss_sold_date_sk = d_date_sk
        |        and ss_store_sk = s_store_sk
        |        and d_month_seq in (1212,1212+1,1212+2,1212+3,1212+4,1212+5,1212+6,1212+7,1212+8,1212+9,1212+10,1212+11)
        |        and ((    i_category in ('Books','Children','Electronics')
        |              and i_class in ('personal','portable','reference','self-help')
        |              and i_brand in ('scholaramalgamalg #14','scholaramalgamalg #7',
        |		                  'exportiunivamalg #9','scholaramalgamalg #9'))
        |           or(    i_category in ('Women','Music','Men')
        |              and i_class in ('accessories','classical','fragrances','pants')
        |              and i_brand in ('amalgimporto #1','edu packscholar #1','exportiimporto #1',
        |		                 'importoamalg #1')))
        |group by i_manager_id, d_moy) tmp1
        |where case when avg_monthly_sales > 0 then abs (sum_sales - avg_monthly_sales) / avg_monthly_sales else null end > 0.1
        |order by i_manager_id
        |        ,avg_monthly_sales
        |        ,sum_sales
        |""".stripMargin,

    "Q64" ->
      """
        |with cs_ui as
        | (select cs_item_sk
        |        ,sum(cs_ext_list_price) as sale,sum(cr_refunded_cash+cr_reversed_charge+cr_store_credit) as refund
        |  from catalog_sales
        |      ,catalog_returns
        |  where cs_item_sk = cr_item_sk
        |    and cs_order_number = cr_order_number
        |  group by cs_item_sk
        |  having sum(cs_ext_list_price)>2*sum(cr_refunded_cash+cr_reversed_charge+cr_store_credit)),
        |cross_sales as
        | (select i_product_name product_name
        |     ,i_item_sk item_sk
        |     ,s_store_name store_name
        |     ,s_zip store_zip
        |     ,ad1.ca_street_number b_street_number
        |     ,ad1.ca_street_name b_street_name
        |     ,ad1.ca_city b_city
        |     ,ad1.ca_zip b_zip
        |     ,ad2.ca_street_number c_street_number
        |     ,ad2.ca_street_name c_street_name
        |     ,ad2.ca_city c_city
        |     ,ad2.ca_zip c_zip
        |     ,d1.d_year as syear
        |     ,d2.d_year as fsyear
        |     ,d3.d_year s2year
        |     ,count(*) cnt
        |     ,sum(ss_wholesale_cost) s1
        |     ,sum(ss_list_price) s2
        |     ,sum(ss_coupon_amt) s3
        |  FROM   store_sales
        |        ,store_returns
        |        ,cs_ui
        |        ,date_dim d1
        |        ,date_dim d2
        |        ,date_dim d3
        |        ,store
        |        ,customer
        |        ,customer_demographics cd1
        |        ,customer_demographics cd2
        |        ,promotion
        |        ,household_demographics hd1
        |        ,household_demographics hd2
        |        ,customer_address ad1
        |        ,customer_address ad2
        |        ,income_band ib1
        |        ,income_band ib2
        |        ,item
        |  WHERE  ss_store_sk = s_store_sk AND
        |         ss_sold_date_sk = d1.d_date_sk AND
        |         ss_customer_sk = c_customer_sk AND
        |         ss_cdemo_sk= cd1.cd_demo_sk AND
        |         ss_hdemo_sk = hd1.hd_demo_sk AND
        |         ss_addr_sk = ad1.ca_address_sk and
        |         ss_item_sk = i_item_sk and
        |         ss_item_sk = sr_item_sk and
        |         ss_ticket_number = sr_ticket_number and
        |         ss_item_sk = cs_ui.cs_item_sk and
        |         c_current_cdemo_sk = cd2.cd_demo_sk AND
        |         c_current_hdemo_sk = hd2.hd_demo_sk AND
        |         c_current_addr_sk = ad2.ca_address_sk and
        |         c_first_sales_date_sk = d2.d_date_sk and
        |         c_first_shipto_date_sk = d3.d_date_sk and
        |         ss_promo_sk = p_promo_sk and
        |         hd1.hd_income_band_sk = ib1.ib_income_band_sk and
        |         hd2.hd_income_band_sk = ib2.ib_income_band_sk and
        |         cd1.cd_marital_status <> cd2.cd_marital_status and
        |         i_color in ('maroon','burnished','dim','steel','navajo','chocolate') and
        |         i_current_price between 35 and 35 + 10 and
        |         i_current_price between 35 + 1 and 35 + 15
        |group by i_product_name
        |       ,i_item_sk
        |       ,s_store_name
        |       ,s_zip
        |       ,ad1.ca_street_number
        |       ,ad1.ca_street_name
        |       ,ad1.ca_city
        |       ,ad1.ca_zip
        |       ,ad2.ca_street_number
        |       ,ad2.ca_street_name
        |       ,ad2.ca_city
        |       ,ad2.ca_zip
        |       ,d1.d_year
        |       ,d2.d_year
        |       ,d3.d_year
        |)
        |select cs1.product_name
        |     ,cs1.store_name
        |     ,cs1.store_zip
        |     ,cs1.b_street_number
        |     ,cs1.b_street_name
        |     ,cs1.b_city
        |     ,cs1.b_zip
        |     ,cs1.c_street_number
        |     ,cs1.c_street_name
        |     ,cs1.c_city
        |     ,cs1.c_zip
        |     ,cs1.syear as cs1_syear
        |     ,cs1.cnt as cs1_cnt
        |     ,cs1.s1 as s11
        |     ,cs1.s2 as s21
        |     ,cs1.s3 as s31
        |     ,cs2.s1 as s12
        |     ,cs2.s2 as s22
        |     ,cs2.s3 as s32
        |     ,cs2.syear as cs2_syear
        |     ,cs2.cnt as cs2_cnt
        |from cross_sales cs1,cross_sales cs2
        |where cs1.item_sk=cs2.item_sk and
        |     cs1.syear = 2000 and
        |     cs2.syear = 2000 + 1 and
        |     cs2.cnt <= cs1.cnt and
        |     cs1.store_name = cs2.store_name and
        |     cs1.store_zip = cs2.store_zip
        |order by cs1.product_name
        |       ,cs1.store_name
        |       ,cs2.cnt
        |       ,cs1.s1
        |       ,cs2.s1
        |""".stripMargin,

    "Q65" ->
      """
        |select
        |	s_store_name,
        |	i_item_desc,
        |	sc.revenue,
        |	i_current_price,
        |	i_wholesale_cost,
        |	i_brand
        | from store, item,
        |     (select ss_store_sk, avg(revenue) as ave
        | 	from
        | 	    (select  ss_store_sk, ss_item_sk,
        | 		     sum(ss_sales_price) as revenue
        | 		from store_sales, date_dim
        | 		where ss_sold_date_sk = d_date_sk and d_month_seq between 1212 and 1212+11
        | 		group by ss_store_sk, ss_item_sk) sa
        | 	group by ss_store_sk) sb,
        |     (select  ss_store_sk, ss_item_sk, sum(ss_sales_price) as revenue
        | 	from store_sales, date_dim
        | 	where ss_sold_date_sk = d_date_sk and d_month_seq between 1212 and 1212+11
        | 	group by ss_store_sk, ss_item_sk) sc
        | where sb.ss_store_sk = sc.ss_store_sk and
        |       sc.revenue <= 0.1 * sb.ave and
        |       s_store_sk = sc.ss_store_sk and
        |       i_item_sk = sc.ss_item_sk
        | order by s_store_name, i_item_desc
        |""".stripMargin,

    "Q66" ->
      """
        |select
        |         w_warehouse_name
        | 	,w_warehouse_sq_ft
        | 	,w_city
        | 	,w_county
        | 	,w_state
        | 	,w_country
        |        ,ship_carriers
        |        ,year
        | 	,sum(jan_sales) as jan_sales
        | 	,sum(feb_sales) as feb_sales
        | 	,sum(mar_sales) as mar_sales
        | 	,sum(apr_sales) as apr_sales
        | 	,sum(may_sales) as may_sales
        | 	,sum(jun_sales) as jun_sales
        | 	,sum(jul_sales) as jul_sales
        | 	,sum(aug_sales) as aug_sales
        | 	,sum(sep_sales) as sep_sales
        | 	,sum(oct_sales) as oct_sales
        | 	,sum(nov_sales) as nov_sales
        | 	,sum(dec_sales) as dec_sales
        | 	,sum(jan_sales/w_warehouse_sq_ft) as jan_sales_per_sq_foot
        | 	,sum(feb_sales/w_warehouse_sq_ft) as feb_sales_per_sq_foot
        | 	,sum(mar_sales/w_warehouse_sq_ft) as mar_sales_per_sq_foot
        | 	,sum(apr_sales/w_warehouse_sq_ft) as apr_sales_per_sq_foot
        | 	,sum(may_sales/w_warehouse_sq_ft) as may_sales_per_sq_foot
        | 	,sum(jun_sales/w_warehouse_sq_ft) as jun_sales_per_sq_foot
        | 	,sum(jul_sales/w_warehouse_sq_ft) as jul_sales_per_sq_foot
        | 	,sum(aug_sales/w_warehouse_sq_ft) as aug_sales_per_sq_foot
        | 	,sum(sep_sales/w_warehouse_sq_ft) as sep_sales_per_sq_foot
        | 	,sum(oct_sales/w_warehouse_sq_ft) as oct_sales_per_sq_foot
        | 	,sum(nov_sales/w_warehouse_sq_ft) as nov_sales_per_sq_foot
        | 	,sum(dec_sales/w_warehouse_sq_ft) as dec_sales_per_sq_foot
        | 	,sum(jan_net) as jan_net
        | 	,sum(feb_net) as feb_net
        | 	,sum(mar_net) as mar_net
        | 	,sum(apr_net) as apr_net
        | 	,sum(may_net) as may_net
        | 	,sum(jun_net) as jun_net
        | 	,sum(jul_net) as jul_net
        | 	,sum(aug_net) as aug_net
        | 	,sum(sep_net) as sep_net
        | 	,sum(oct_net) as oct_net
        | 	,sum(nov_net) as nov_net
        | 	,sum(dec_net) as dec_net
        | from (
        |     select
        | 	w_warehouse_name
        | 	,w_warehouse_sq_ft
        | 	,w_city
        | 	,w_county
        | 	,w_state
        | 	,w_country
        | 	,'DIAMOND' || ',' || 'AIRBORNE' as ship_carriers
        |       ,d_year as year
        | 	,sum(case when d_moy = 1
        | 		then ws_sales_price* ws_quantity else 0 end) as jan_sales
        | 	,sum(case when d_moy = 2
        | 		then ws_sales_price* ws_quantity else 0 end) as feb_sales
        | 	,sum(case when d_moy = 3
        | 		then ws_sales_price* ws_quantity else 0 end) as mar_sales
        | 	,sum(case when d_moy = 4
        | 		then ws_sales_price* ws_quantity else 0 end) as apr_sales
        | 	,sum(case when d_moy = 5
        | 		then ws_sales_price* ws_quantity else 0 end) as may_sales
        | 	,sum(case when d_moy = 6
        | 		then ws_sales_price* ws_quantity else 0 end) as jun_sales
        | 	,sum(case when d_moy = 7
        | 		then ws_sales_price* ws_quantity else 0 end) as jul_sales
        | 	,sum(case when d_moy = 8
        | 		then ws_sales_price* ws_quantity else 0 end) as aug_sales
        | 	,sum(case when d_moy = 9
        | 		then ws_sales_price* ws_quantity else 0 end) as sep_sales
        | 	,sum(case when d_moy = 10
        | 		then ws_sales_price* ws_quantity else 0 end) as oct_sales
        | 	,sum(case when d_moy = 11
        | 		then ws_sales_price* ws_quantity else 0 end) as nov_sales
        | 	,sum(case when d_moy = 12
        | 		then ws_sales_price* ws_quantity else 0 end) as dec_sales
        | 	,sum(case when d_moy = 1
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as jan_net
        | 	,sum(case when d_moy = 2
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as feb_net
        | 	,sum(case when d_moy = 3
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as mar_net
        | 	,sum(case when d_moy = 4
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as apr_net
        | 	,sum(case when d_moy = 5
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as may_net
        | 	,sum(case when d_moy = 6
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as jun_net
        | 	,sum(case when d_moy = 7
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as jul_net
        | 	,sum(case when d_moy = 8
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as aug_net
        | 	,sum(case when d_moy = 9
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as sep_net
        | 	,sum(case when d_moy = 10
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as oct_net
        | 	,sum(case when d_moy = 11
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as nov_net
        | 	,sum(case when d_moy = 12
        | 		then ws_net_paid_inc_tax * ws_quantity else 0 end) as dec_net
        |     from
        |          web_sales
        |         ,warehouse
        |         ,date_dim
        |         ,time_dim
        | 	  ,ship_mode
        |     where
        |            ws_warehouse_sk =  w_warehouse_sk
        |        and ws_sold_date_sk = d_date_sk
        |        and ws_sold_time_sk = t_time_sk
        | 	and ws_ship_mode_sk = sm_ship_mode_sk
        |        and d_year = 2002
        | 	and t_time between 49530 and 49530+28800
        | 	and sm_carrier in ('DIAMOND','AIRBORNE')
        |     group by
        |        w_warehouse_name
        | 	,w_warehouse_sq_ft
        | 	,w_city
        | 	,w_county
        | 	,w_state
        | 	,w_country
        |       ,d_year
        | union all
        |     select
        | 	w_warehouse_name
        | 	,w_warehouse_sq_ft
        | 	,w_city
        | 	,w_county
        | 	,w_state
        | 	,w_country
        | 	,'DIAMOND' || ',' || 'AIRBORNE' as ship_carriers
        |       ,d_year as year
        | 	,sum(case when d_moy = 1
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as jan_sales
        | 	,sum(case when d_moy = 2
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as feb_sales
        | 	,sum(case when d_moy = 3
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as mar_sales
        | 	,sum(case when d_moy = 4
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as apr_sales
        | 	,sum(case when d_moy = 5
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as may_sales
        | 	,sum(case when d_moy = 6
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as jun_sales
        | 	,sum(case when d_moy = 7
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as jul_sales
        | 	,sum(case when d_moy = 8
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as aug_sales
        | 	,sum(case when d_moy = 9
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as sep_sales
        | 	,sum(case when d_moy = 10
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as oct_sales
        | 	,sum(case when d_moy = 11
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as nov_sales
        | 	,sum(case when d_moy = 12
        | 		then cs_ext_sales_price* cs_quantity else 0 end) as dec_sales
        | 	,sum(case when d_moy = 1
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as jan_net
        | 	,sum(case when d_moy = 2
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as feb_net
        | 	,sum(case when d_moy = 3
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as mar_net
        | 	,sum(case when d_moy = 4
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as apr_net
        | 	,sum(case when d_moy = 5
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as may_net
        | 	,sum(case when d_moy = 6
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as jun_net
        | 	,sum(case when d_moy = 7
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as jul_net
        | 	,sum(case when d_moy = 8
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as aug_net
        | 	,sum(case when d_moy = 9
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as sep_net
        | 	,sum(case when d_moy = 10
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as oct_net
        | 	,sum(case when d_moy = 11
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as nov_net
        | 	,sum(case when d_moy = 12
        | 		then cs_net_paid_inc_ship_tax * cs_quantity else 0 end) as dec_net
        |     from
        |          catalog_sales
        |         ,warehouse
        |         ,date_dim
        |         ,time_dim
        | 	 ,ship_mode
        |     where
        |            cs_warehouse_sk =  w_warehouse_sk
        |        and cs_sold_date_sk = d_date_sk
        |        and cs_sold_time_sk = t_time_sk
        | 	and cs_ship_mode_sk = sm_ship_mode_sk
        |        and d_year = 2002
        | 	and t_time between 49530 AND 49530+28800
        | 	and sm_carrier in ('DIAMOND','AIRBORNE')
        |     group by
        |        w_warehouse_name
        | 	,w_warehouse_sq_ft
        | 	,w_city
        | 	,w_county
        | 	,w_state
        | 	,w_country
        |       ,d_year
        | ) x
        | group by
        |        w_warehouse_name
        | 	,w_warehouse_sq_ft
        | 	,w_city
        | 	,w_county
        | 	,w_state
        | 	,w_country
        | 	,ship_carriers
        |       ,year
        | order by w_warehouse_name
        |""".stripMargin,

    "Q67" ->
      """
        |select *
        |from (select i_category
        |            ,i_class
        |            ,i_brand
        |            ,i_product_name
        |            ,d_year
        |            ,d_qoy
        |            ,d_moy
        |            ,s_store_id
        |            ,sumsales
        |            ,rank() over (partition by i_category order by sumsales desc) rk
        |      from (select i_category
        |                  ,i_class
        |                  ,i_brand
        |                  ,i_product_name
        |                  ,d_year
        |                  ,d_qoy
        |                  ,d_moy
        |                  ,s_store_id
        |                  ,sum(coalesce(ss_sales_price*ss_quantity,0)) sumsales
        |            from store_sales
        |                ,date_dim
        |                ,store
        |                ,item
        |       where  ss_sold_date_sk=d_date_sk
        |          and ss_item_sk=i_item_sk
        |          and ss_store_sk = s_store_sk
        |          and d_month_seq between 1212 and 1212+11
        |       group by  rollup(i_category, i_class, i_brand, i_product_name, d_year, d_qoy, d_moy,s_store_id))dw1) dw2
        |where rk <= 100
        |order by i_category
        |        ,i_class
        |        ,i_brand
        |        ,i_product_name
        |        ,d_year
        |        ,d_qoy
        |        ,d_moy
        |        ,s_store_id
        |        ,sumsales
        |        ,rk
        |""".stripMargin,

    "Q68" ->
      """
        |select c_last_name
        |       ,c_first_name
        |       ,ca_city
        |       ,bought_city
        |       ,ss_ticket_number
        |       ,extended_price
        |       ,extended_tax
        |       ,list_price
        | from (select ss_ticket_number
        |             ,ss_customer_sk
        |             ,ca_city bought_city
        |             ,sum(ss_ext_sales_price) extended_price
        |             ,sum(ss_ext_list_price) list_price
        |             ,sum(ss_ext_tax) extended_tax
        |       from store_sales
        |           ,date_dim
        |           ,store
        |           ,household_demographics
        |           ,customer_address
        |       where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |         and store_sales.ss_store_sk = store.s_store_sk
        |        and store_sales.ss_hdemo_sk = household_demographics.hd_demo_sk
        |        and store_sales.ss_addr_sk = customer_address.ca_address_sk
        |        and date_dim.d_dom between 1 and 2
        |        and (household_demographics.hd_dep_count = 5 or
        |             household_demographics.hd_vehicle_count= 3)
        |        and date_dim.d_year in (1999,1999+1,1999+2)
        |        and store.s_city in ('Midway','Fairview')
        |       group by ss_ticket_number
        |               ,ss_customer_sk
        |               ,ss_addr_sk,ca_city) dn
        |      ,customer
        |      ,customer_address current_addr
        | where ss_customer_sk = c_customer_sk
        |   and customer.c_current_addr_sk = current_addr.ca_address_sk
        |   and current_addr.ca_city <> bought_city
        | order by c_last_name
        |         ,ss_ticket_number
        |""".stripMargin,

    "Q69" ->
      """
        |select
        |  cd_gender,
        |  cd_marital_status,
        |  cd_education_status,
        |  count(*) cnt1,
        |  cd_purchase_estimate,
        |  count(*) cnt2,
        |  cd_credit_rating,
        |  count(*) cnt3
        | from
        |  customer c,customer_address ca,customer_demographics
        | where
        |  c.c_current_addr_sk = ca.ca_address_sk and
        |  ca_state in ('CO','IL','MN') and
        |  cd_demo_sk = c.c_current_cdemo_sk and
        |  exists (select *
        |          from store_sales,date_dim
        |          where c.c_customer_sk = ss_customer_sk and
        |                ss_sold_date_sk = d_date_sk and
        |                d_year = 1999 and
        |                d_moy between 1 and 1+2) and
        |   (not exists (select *
        |            from web_sales,date_dim
        |            where c.c_customer_sk = ws_bill_customer_sk and
        |                  ws_sold_date_sk = d_date_sk and
        |                  d_year = 1999 and
        |                  d_moy between 1 and 1+2) and
        |    not exists (select *
        |            from catalog_sales,date_dim
        |            where c.c_customer_sk = cs_ship_customer_sk and
        |                  cs_sold_date_sk = d_date_sk and
        |                  d_year = 1999 and
        |                  d_moy between 1 and 1+2))
        | group by cd_gender,
        |          cd_marital_status,
        |          cd_education_status,
        |          cd_purchase_estimate,
        |          cd_credit_rating
        | order by cd_gender,
        |          cd_marital_status,
        |          cd_education_status,
        |          cd_purchase_estimate,
        |          cd_credit_rating
        |""".stripMargin,

    "Q70" ->
      """
        |select
        |    sum(ss_net_profit) as total_sum
        |   ,s_state
        |   ,s_county
        |   ,grouping(s_state)+grouping(s_county) as lochierarchy
        |   ,rank() over (
        | 	partition by grouping(s_state)+grouping(s_county),
        | 	case when grouping(s_county) = 0 then s_state end
        | 	order by sum(ss_net_profit) desc) as rank_within_parent
        | from
        |    store_sales
        |   ,date_dim       d1
        |   ,store
        | where
        |    d1.d_month_seq between 1212 and 1212+11
        | and d1.d_date_sk = ss_sold_date_sk
        | and s_store_sk  = ss_store_sk
        | and s_state in
        |             ( select s_state
        |               from  (select s_state as s_state,
        | 			    rank() over ( partition by s_state order by sum(ss_net_profit) desc) as ranking
        |                      from   store_sales, store, date_dim
        |                      where  d_month_seq between 1212 and 1212+11
        | 			    and d_date_sk = ss_sold_date_sk
        | 			    and s_store_sk  = ss_store_sk
        |                      group by s_state
        |                     ) tmp1
        |               where ranking <= 5
        |             )
        | group by rollup(s_state,s_county)
        | order by
        |   lochierarchy desc
        |  ,case when lochierarchy = 0 then s_state end
        |  ,rank_within_parent
        |""".stripMargin,

    "Q71" ->
      """
        |select i_brand_id brand_id, i_brand brand,t_hour,t_minute,
        | 	sum(ext_price) ext_price
        | from item, (select ws_ext_sales_price as ext_price,
        |                        ws_sold_date_sk as sold_date_sk,
        |                        ws_item_sk as sold_item_sk,
        |                        ws_sold_time_sk as time_sk
        |                 from web_sales,date_dim
        |                 where d_date_sk = ws_sold_date_sk
        |                   and d_moy=12
        |                   and d_year=2000
        |                 union all
        |                 select cs_ext_sales_price as ext_price,
        |                        cs_sold_date_sk as sold_date_sk,
        |                        cs_item_sk as sold_item_sk,
        |                        cs_sold_time_sk as time_sk
        |                 from catalog_sales,date_dim
        |                 where d_date_sk = cs_sold_date_sk
        |                   and d_moy=12
        |                   and d_year=2000
        |                 union all
        |                 select ss_ext_sales_price as ext_price,
        |                        ss_sold_date_sk as sold_date_sk,
        |                        ss_item_sk as sold_item_sk,
        |                        ss_sold_time_sk as time_sk
        |                 from store_sales,date_dim
        |                 where d_date_sk = ss_sold_date_sk
        |                   and d_moy=12
        |                   and d_year=2000
        |                 ) tmp,time_dim
        | where
        |   sold_item_sk = i_item_sk
        |   and i_manager_id=1
        |   and time_sk = t_time_sk
        |   and (t_meal_time = 'breakfast' or t_meal_time = 'dinner')
        | group by i_brand, i_brand_id,t_hour,t_minute
        | order by ext_price desc, i_brand_id
        |""".stripMargin,

    "Q73" ->
      """
        |select c_last_name
        |       ,c_first_name
        |       ,c_salutation
        |       ,c_preferred_cust_flag
        |       ,ss_ticket_number
        |       ,cnt from
        |   (select ss_ticket_number
        |          ,ss_customer_sk
        |          ,count(*) cnt
        |    from store_sales,date_dim,store,household_demographics
        |    where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |    and store_sales.ss_store_sk = store.s_store_sk
        |    and store_sales.ss_hdemo_sk = household_demographics.hd_demo_sk
        |    and date_dim.d_dom between 1 and 2
        |    and (household_demographics.hd_buy_potential = '>10000' or
        |         household_demographics.hd_buy_potential = 'Unknown')
        |    and household_demographics.hd_vehicle_count > 0
        |    and case when household_demographics.hd_vehicle_count > 0 then
        |             household_demographics.hd_dep_count/ household_demographics.hd_vehicle_count else null end > 1
        |    and date_dim.d_year in (1998,1998+1,1998+2)
        |    and store.s_county in ('Williamson County','Williamson County','Williamson County','Williamson County')
        |    group by ss_ticket_number,ss_customer_sk) dj,customer
        |    where ss_customer_sk = c_customer_sk
        |      and cnt between 1 and 5
        |    order by cnt desc, c_last_name asc
        |""".stripMargin,

    "Q74" ->
      """
        |with year_total as (
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,d_year as year
        |       ,max(ss_net_paid) year_total
        |       ,'s' sale_type
        | from customer
        |     ,store_sales
        |     ,date_dim
        | where c_customer_sk = ss_customer_sk
        |   and ss_sold_date_sk = d_date_sk
        |   and d_year in (2001,2001+1)
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,d_year
        | union all
        | select c_customer_id customer_id
        |       ,c_first_name customer_first_name
        |       ,c_last_name customer_last_name
        |       ,d_year as year
        |       ,max(ws_net_paid) year_total
        |       ,'w' sale_type
        | from customer
        |     ,web_sales
        |     ,date_dim
        | where c_customer_sk = ws_bill_customer_sk
        |   and ws_sold_date_sk = d_date_sk
        |   and d_year in (2001,2001+1)
        | group by c_customer_id
        |         ,c_first_name
        |         ,c_last_name
        |         ,d_year
        |         )
        |  select
        |        t_s_secyear.customer_id, t_s_secyear.customer_first_name, t_s_secyear.customer_last_name
        | from year_total t_s_firstyear
        |     ,year_total t_s_secyear
        |     ,year_total t_w_firstyear
        |     ,year_total t_w_secyear
        | where t_s_secyear.customer_id = t_s_firstyear.customer_id
        |         and t_s_firstyear.customer_id = t_w_secyear.customer_id
        |         and t_s_firstyear.customer_id = t_w_firstyear.customer_id
        |         and t_s_firstyear.sale_type = 's'
        |         and t_w_firstyear.sale_type = 'w'
        |         and t_s_secyear.sale_type = 's'
        |         and t_w_secyear.sale_type = 'w'
        |         and t_s_firstyear.year = 2001
        |         and t_s_secyear.year = 2001+1
        |         and t_w_firstyear.year = 2001
        |         and t_w_secyear.year = 2001+1
        |         and t_s_firstyear.year_total > 0
        |         and t_w_firstyear.year_total > 0
        |         and case when t_w_firstyear.year_total > 0 then t_w_secyear.year_total / t_w_firstyear.year_total else null end
        |           > case when t_s_firstyear.year_total > 0 then t_s_secyear.year_total / t_s_firstyear.year_total else null end
        | order by 2,1,3
        |""".stripMargin,

    "Q75" ->
      """
        |WITH all_sales AS (
        | SELECT d_year
        |       ,i_brand_id
        |       ,i_class_id
        |       ,i_category_id
        |       ,i_manufact_id
        |       ,SUM(sales_cnt) AS sales_cnt
        |       ,SUM(sales_amt) AS sales_amt
        | FROM (SELECT d_year
        |             ,i_brand_id
        |             ,i_class_id
        |             ,i_category_id
        |             ,i_manufact_id
        |             ,cs_quantity - COALESCE(cr_return_quantity,0) AS sales_cnt
        |             ,cs_ext_sales_price - COALESCE(cr_return_amount,0.0) AS sales_amt
        |       FROM catalog_sales JOIN item ON i_item_sk=cs_item_sk
        |                          JOIN date_dim ON d_date_sk=cs_sold_date_sk
        |                          LEFT JOIN catalog_returns ON (cs_order_number=cr_order_number
        |                                                    AND cs_item_sk=cr_item_sk)
        |       WHERE i_category='Sports'
        |       UNION
        |       SELECT d_year
        |             ,i_brand_id
        |             ,i_class_id
        |             ,i_category_id
        |             ,i_manufact_id
        |             ,ss_quantity - COALESCE(sr_return_quantity,0) AS sales_cnt
        |             ,ss_ext_sales_price - COALESCE(sr_return_amt,0.0) AS sales_amt
        |       FROM store_sales JOIN item ON i_item_sk=ss_item_sk
        |                        JOIN date_dim ON d_date_sk=ss_sold_date_sk
        |                        LEFT JOIN store_returns ON (ss_ticket_number=sr_ticket_number
        |                                                AND ss_item_sk=sr_item_sk)
        |       WHERE i_category='Sports'
        |       UNION
        |       SELECT d_year
        |             ,i_brand_id
        |             ,i_class_id
        |             ,i_category_id
        |             ,i_manufact_id
        |             ,ws_quantity - COALESCE(wr_return_quantity,0) AS sales_cnt
        |             ,ws_ext_sales_price - COALESCE(wr_return_amt,0.0) AS sales_amt
        |       FROM web_sales JOIN item ON i_item_sk=ws_item_sk
        |                      JOIN date_dim ON d_date_sk=ws_sold_date_sk
        |                      LEFT JOIN web_returns ON (ws_order_number=wr_order_number
        |                                            AND ws_item_sk=wr_item_sk)
        |       WHERE i_category='Sports') sales_detail
        | GROUP BY d_year, i_brand_id, i_class_id, i_category_id, i_manufact_id)
        | SELECT prev_yr.d_year AS prev_year
        |                          ,curr_yr.d_year AS year
        |                          ,curr_yr.i_brand_id
        |                          ,curr_yr.i_class_id
        |                          ,curr_yr.i_category_id
        |                          ,curr_yr.i_manufact_id
        |                          ,prev_yr.sales_cnt AS prev_yr_cnt
        |                          ,curr_yr.sales_cnt AS curr_yr_cnt
        |                          ,curr_yr.sales_cnt-prev_yr.sales_cnt AS sales_cnt_diff
        |                          ,curr_yr.sales_amt-prev_yr.sales_amt AS sales_amt_diff
        | FROM all_sales curr_yr, all_sales prev_yr
        | WHERE curr_yr.i_brand_id=prev_yr.i_brand_id
        |   AND curr_yr.i_class_id=prev_yr.i_class_id
        |   AND curr_yr.i_category_id=prev_yr.i_category_id
        |   AND curr_yr.i_manufact_id=prev_yr.i_manufact_id
        |   AND curr_yr.d_year=2002
        |   AND prev_yr.d_year=2002-1
        |   AND CAST(curr_yr.sales_cnt AS DECIMAL(17,2))/CAST(prev_yr.sales_cnt AS DECIMAL(17,2))<0.9
        | ORDER BY sales_cnt_diff,sales_amt_diff
        |""".stripMargin,

    "Q76" ->
      """
        |select channel, col_name, d_year, d_qoy, i_category, COUNT(*) sales_cnt, SUM(ext_sales_price) sales_amt FROM (
        |        SELECT 'store' as channel, 'ss_addr_sk' col_name, d_year, d_qoy, i_category, ss_ext_sales_price ext_sales_price
        |         FROM store_sales, item, date_dim
        |         WHERE ss_addr_sk IS NULL
        |           AND ss_sold_date_sk=d_date_sk
        |           AND ss_item_sk=i_item_sk
        |        UNION ALL
        |        SELECT 'web' as channel, 'ws_web_page_sk' col_name, d_year, d_qoy, i_category, ws_ext_sales_price ext_sales_price
        |         FROM web_sales, item, date_dim
        |         WHERE ws_web_page_sk IS NULL
        |           AND ws_sold_date_sk=d_date_sk
        |           AND ws_item_sk=i_item_sk
        |        UNION ALL
        |        SELECT 'catalog' as channel, 'cs_warehouse_sk' col_name, d_year, d_qoy, i_category, cs_ext_sales_price ext_sales_price
        |         FROM catalog_sales, item, date_dim
        |         WHERE cs_warehouse_sk IS NULL
        |           AND cs_sold_date_sk=d_date_sk
        |           AND cs_item_sk=i_item_sk) foo
        |GROUP BY channel, col_name, d_year, d_qoy, i_category
        |ORDER BY channel, col_name, d_year, d_qoy, i_category
        |""".stripMargin,

    "Q78" ->
      """
        |with ws as
        |  (select d_year AS ws_sold_year, ws_item_sk,
        |    ws_bill_customer_sk ws_customer_sk,
        |    sum(ws_quantity) ws_qty,
        |    sum(ws_wholesale_cost) ws_wc,
        |    sum(ws_sales_price) ws_sp
        |   from web_sales
        |   left join web_returns on wr_order_number=ws_order_number and ws_item_sk=wr_item_sk
        |   join date_dim on ws_sold_date_sk = d_date_sk
        |   where wr_order_number is null
        |   group by d_year, ws_item_sk, ws_bill_customer_sk
        |   ),
        |cs as
        |  (select d_year AS cs_sold_year, cs_item_sk,
        |    cs_bill_customer_sk cs_customer_sk,
        |    sum(cs_quantity) cs_qty,
        |    sum(cs_wholesale_cost) cs_wc,
        |    sum(cs_sales_price) cs_sp
        |   from catalog_sales
        |   left join catalog_returns on cr_order_number=cs_order_number and cs_item_sk=cr_item_sk
        |   join date_dim on cs_sold_date_sk = d_date_sk
        |   where cr_order_number is null
        |   group by d_year, cs_item_sk, cs_bill_customer_sk
        |   ),
        |ss as
        |  (select d_year AS ss_sold_year, ss_item_sk,
        |    ss_customer_sk,
        |    sum(ss_quantity) ss_qty,
        |    sum(ss_wholesale_cost) ss_wc,
        |    sum(ss_sales_price) ss_sp
        |   from store_sales
        |   left join store_returns on sr_ticket_number=ss_ticket_number and ss_item_sk=sr_item_sk
        |   join date_dim on ss_sold_date_sk = d_date_sk
        |   where sr_ticket_number is null
        |   group by d_year, ss_item_sk, ss_customer_sk
        |   )
        | select
        |ss_sold_year, ss_item_sk, ss_customer_sk,
        |round(ss_qty/(coalesce(ws_qty,0)+coalesce(cs_qty,0)),2) ratio,
        |ss_qty store_qty, ss_wc store_wholesale_cost, ss_sp store_sales_price,
        |coalesce(ws_qty,0)+coalesce(cs_qty,0) other_chan_qty,
        |coalesce(ws_wc,0)+coalesce(cs_wc,0) other_chan_wholesale_cost,
        |coalesce(ws_sp,0)+coalesce(cs_sp,0) other_chan_sales_price
        |from ss
        |left join ws on (ws_sold_year=ss_sold_year and ws_item_sk=ss_item_sk and ws_customer_sk=ss_customer_sk)
        |left join cs on (cs_sold_year=ss_sold_year and cs_item_sk=ss_item_sk and cs_customer_sk=ss_customer_sk)
        |where (coalesce(ws_qty,0)>0 or coalesce(cs_qty, 0)>0) and ss_sold_year=2000
        |order by
        |  ss_sold_year, ss_item_sk, ss_customer_sk,
        |  ss_qty desc, ss_wc desc, ss_sp desc,
        |  other_chan_qty,
        |  other_chan_wholesale_cost,
        |  other_chan_sales_price,
        |  ratio
        |""".stripMargin,

    "Q79" ->
      """
        |select
        |  c_last_name,c_first_name,substr(s_city,1,30),ss_ticket_number,amt,profit
        |  from
        |   (select ss_ticket_number
        |          ,ss_customer_sk
        |          ,store.s_city
        |          ,sum(ss_coupon_amt) amt
        |          ,sum(ss_net_profit) profit
        |    from store_sales,date_dim,store,household_demographics
        |    where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |    and store_sales.ss_store_sk = store.s_store_sk
        |    and store_sales.ss_hdemo_sk = household_demographics.hd_demo_sk
        |    and (household_demographics.hd_dep_count = 8 or household_demographics.hd_vehicle_count > 0)
        |    and date_dim.d_dow = 1
        |    and date_dim.d_year in (1998,1998+1,1998+2)
        |    and store.s_number_employees between 200 and 295
        |    group by ss_ticket_number,ss_customer_sk,ss_addr_sk,store.s_city) ms,customer
        |    where ss_customer_sk = c_customer_sk
        | order by c_last_name,c_first_name,substr(s_city,1,30), profit
        |""".stripMargin,

    "Q81" ->
      """
        |with customer_total_return as
        | (select cr_returning_customer_sk as ctr_customer_sk
        |        ,ca_state as ctr_state,
        | 	sum(cr_return_amt_inc_tax) as ctr_total_return
        | from catalog_returns
        |     ,date_dim
        |     ,customer_address
        | where cr_returned_date_sk = d_date_sk
        |   and d_year =1998
        |   and cr_returning_addr_sk = ca_address_sk
        | group by cr_returning_customer_sk
        |         ,ca_state )
        |  select c_customer_id,c_salutation,c_first_name,c_last_name,ca_street_number,ca_street_name
        |                   ,ca_street_type,ca_suite_number,ca_city,ca_county,ca_state,ca_zip,ca_country,ca_gmt_offset
        |                  ,ca_location_type,ctr_total_return
        | from customer_total_return ctr1
        |     ,customer_address
        |     ,customer
        | where ctr1.ctr_total_return > (select avg(ctr_total_return)*1.2
        | 			  from customer_total_return ctr2
        |                  	  where ctr1.ctr_state = ctr2.ctr_state)
        |       and ca_address_sk = c_current_addr_sk
        |       and ca_state = 'IL'
        |       and ctr1.ctr_customer_sk = c_customer_sk
        | order by c_customer_id,c_salutation,c_first_name,c_last_name,ca_street_number,ca_street_name
        |                   ,ca_street_type,ca_suite_number,ca_city,ca_county,ca_state,ca_zip,ca_country,ca_gmt_offset
        |                  ,ca_location_type,ctr_total_return
        |""".stripMargin,

    "Q83" ->
      """
        |with sr_items as
        | (select i_item_id item_id,
        |        sum(sr_return_quantity) sr_item_qty
        | from store_returns,
        |      item,
        |      date_dim
        | where sr_item_sk = i_item_sk
        | and   d_date    in
        |	(select d_date
        |	from date_dim
        |	where d_week_seq in
        |		(select d_week_seq
        |		from date_dim
        |	  where d_date in ('1998-01-02','1998-10-15','1998-11-10')))
        | and   sr_returned_date_sk   = d_date_sk
        | group by i_item_id),
        | cr_items as
        | (select i_item_id item_id,
        |        sum(cr_return_quantity) cr_item_qty
        | from catalog_returns,
        |      item,
        |      date_dim
        | where cr_item_sk = i_item_sk
        | and   d_date    in
        |	(select d_date
        |	from date_dim
        |	where d_week_seq in
        |		(select d_week_seq
        |		from date_dim
        |	  where d_date in ('1998-01-02','1998-10-15','1998-11-10')))
        | and   cr_returned_date_sk   = d_date_sk
        | group by i_item_id),
        | wr_items as
        | (select i_item_id item_id,
        |        sum(wr_return_quantity) wr_item_qty
        | from web_returns,
        |      item,
        |      date_dim
        | where wr_item_sk = i_item_sk
        | and   d_date    in
        |	(select d_date
        |	from date_dim
        |	where d_week_seq in
        |		(select d_week_seq
        |		from date_dim
        |		where d_date in ('1998-01-02','1998-10-15','1998-11-10')))
        | and   wr_returned_date_sk   = d_date_sk
        | group by i_item_id)
        |  select sr_items.item_id
        |       ,sr_item_qty
        |       ,sr_item_qty/(sr_item_qty+cr_item_qty+wr_item_qty)/3.0 * 100 sr_dev
        |       ,cr_item_qty
        |       ,cr_item_qty/(sr_item_qty+cr_item_qty+wr_item_qty)/3.0 * 100 cr_dev
        |       ,wr_item_qty
        |       ,wr_item_qty/(sr_item_qty+cr_item_qty+wr_item_qty)/3.0 * 100 wr_dev
        |       ,(sr_item_qty+cr_item_qty+wr_item_qty)/3.0 average
        | from sr_items
        |     ,cr_items
        |     ,wr_items
        | where sr_items.item_id=cr_items.item_id
        |   and sr_items.item_id=wr_items.item_id
        | order by sr_items.item_id
        |         ,sr_item_qty
        |""".stripMargin,

    "Q84" ->
      """
        |select c_customer_id as customer_id
        |       , coalesce(c_last_name,'') || ', ' || coalesce(c_first_name,'') as customername
        | from customer
        |     ,customer_address
        |     ,customer_demographics
        |     ,household_demographics
        |     ,income_band
        |     ,store_returns
        | where ca_city	        =  'Hopewell'
        |   and c_current_addr_sk = ca_address_sk
        |   and ib_lower_bound   >=  32287
        |   and ib_upper_bound   <=  32287 + 50000
        |   and ib_income_band_sk = hd_income_band_sk
        |   and cd_demo_sk = c_current_cdemo_sk
        |   and hd_demo_sk = c_current_hdemo_sk
        |   and sr_cdemo_sk = cd_demo_sk
        | order by c_customer_id
        |""".stripMargin,

    "Q85" ->
      """
        |select substr(r_reason_desc,1,20)
        |       ,avg(ws_quantity)
        |       ,avg(wr_refunded_cash)
        |       ,avg(wr_fee)
        | from web_sales, web_returns, web_page, customer_demographics cd1,
        |      customer_demographics cd2, customer_address, date_dim, reason
        | where ws_web_page_sk = wp_web_page_sk
        |   and ws_item_sk = wr_item_sk
        |   and ws_order_number = wr_order_number
        |   and ws_sold_date_sk = d_date_sk and d_year = 1998
        |   and cd1.cd_demo_sk = wr_refunded_cdemo_sk
        |   and cd2.cd_demo_sk = wr_returning_cdemo_sk
        |   and ca_address_sk = wr_refunded_addr_sk
        |   and r_reason_sk = wr_reason_sk
        |   and
        |   (
        |    (
        |     cd1.cd_marital_status = 'M'
        |     and
        |     cd1.cd_marital_status = cd2.cd_marital_status
        |     and
        |     cd1.cd_education_status = '4 yr Degree'
        |     and
        |     cd1.cd_education_status = cd2.cd_education_status
        |     and
        |     ws_sales_price between 100.00 and 150.00
        |    )
        |   or
        |    (
        |     cd1.cd_marital_status = 'D'
        |     and
        |     cd1.cd_marital_status = cd2.cd_marital_status
        |     and
        |     cd1.cd_education_status = 'Primary'
        |     and
        |     cd1.cd_education_status = cd2.cd_education_status
        |     and
        |     ws_sales_price between 50.00 and 100.00
        |    )
        |   or
        |    (
        |     cd1.cd_marital_status = 'U'
        |     and
        |     cd1.cd_marital_status = cd2.cd_marital_status
        |     and
        |     cd1.cd_education_status = 'Advanced Degree'
        |     and
        |     cd1.cd_education_status = cd2.cd_education_status
        |     and
        |     ws_sales_price between 150.00 and 200.00
        |    )
        |   )
        |   and
        |   (
        |    (
        |     ca_country = 'United States'
        |     and
        |     ca_state in ('KY', 'GA', 'NM')
        |     and ws_net_profit between 100 and 200
        |    )
        |    or
        |    (
        |     ca_country = 'United States'
        |     and
        |     ca_state in ('MT', 'OR', 'IN')
        |     and ws_net_profit between 150 and 300
        |    )
        |    or
        |    (
        |     ca_country = 'United States'
        |     and
        |     ca_state in ('WI', 'MO', 'WV')
        |     and ws_net_profit between 50 and 250
        |    )
        |   )
        |group by r_reason_desc
        |order by substr(r_reason_desc,1,20)
        |        ,avg(ws_quantity)
        |        ,avg(wr_refunded_cash)
        |        ,avg(wr_fee)
        |""".stripMargin,

    "Q86" ->
      """
        |select
        |    sum(ws_net_paid) as total_sum
        |   ,i_category
        |   ,i_class
        |   ,grouping(i_category)+grouping(i_class) as lochierarchy
        |   ,rank() over (
        | 	partition by grouping(i_category)+grouping(i_class),
        | 	case when grouping(i_class) = 0 then i_category end
        | 	order by sum(ws_net_paid) desc) as rank_within_parent
        | from
        |    web_sales
        |   ,date_dim       d1
        |   ,item
        | where
        |    d1.d_month_seq between 1212 and 1212+11
        | and d1.d_date_sk = ws_sold_date_sk
        | and i_item_sk  = ws_item_sk
        | group by rollup(i_category,i_class)
        | order by
        |   lochierarchy desc,
        |   case when lochierarchy = 0 then i_category end,
        |   rank_within_parent
        |""".stripMargin,

    "Q87" ->
      """
        |select count(*)
        |from ((select distinct c_last_name, c_first_name, d_date
        |       from store_sales, date_dim, customer
        |       where store_sales.ss_sold_date_sk = date_dim.d_date_sk
        |         and store_sales.ss_customer_sk = customer.c_customer_sk
        |         and d_month_seq between 1212 and 1212+11)
        |       except
        |      (select distinct c_last_name, c_first_name, d_date
        |       from catalog_sales, date_dim, customer
        |       where catalog_sales.cs_sold_date_sk = date_dim.d_date_sk
        |         and catalog_sales.cs_bill_customer_sk = customer.c_customer_sk
        |         and d_month_seq between 1212 and 1212+11)
        |       except
        |      (select distinct c_last_name, c_first_name, d_date
        |       from web_sales, date_dim, customer
        |       where web_sales.ws_sold_date_sk = date_dim.d_date_sk
        |         and web_sales.ws_bill_customer_sk = customer.c_customer_sk
        |         and d_month_seq between 1212 and 1212+11)
        |) cool_cust
        |""".stripMargin,

    "Q89" ->
      """
        |select *
        |from(
        |select i_category, i_class, i_brand,
        |       s_store_name, s_company_name,
        |       d_moy,
        |       sum(ss_sales_price) sum_sales,
        |       avg(sum(ss_sales_price)) over
        |         (partition by i_category, i_brand, s_store_name, s_company_name)
        |         avg_monthly_sales
        |from item, store_sales, date_dim, store
        |where ss_item_sk = i_item_sk and
        |      ss_sold_date_sk = d_date_sk and
        |      ss_store_sk = s_store_sk and
        |      d_year in (2000) and
        |        ((i_category in ('Home','Books','Electronics') and
        |          i_class in ('wallpaper','parenting','musical')
        |         )
        |      or (i_category in ('Shoes','Jewelry','Men') and
        |          i_class in ('womens','birdal','pants')
        |        ))
        |group by i_category, i_class, i_brand,
        |         s_store_name, s_company_name, d_moy) tmp1
        |where case when (avg_monthly_sales <> 0) then (abs(sum_sales - avg_monthly_sales) / avg_monthly_sales) else null end > 0.1
        |order by sum_sales - avg_monthly_sales, s_store_name
        |""".stripMargin,

    "Q91" ->
      """
        |select
        |        cc_call_center_id Call_Center,
        |        cc_name Call_Center_Name,
        |        cc_manager Manager,
        |        sum(cr_net_loss) Returns_Loss
        |from
        |        call_center,
        |        catalog_returns,
        |        date_dim,
        |        customer,
        |        customer_address,
        |        customer_demographics,
        |        household_demographics
        |where
        |        cr_call_center_sk       = cc_call_center_sk
        |and     cr_returned_date_sk     = d_date_sk
        |and     cr_returning_customer_sk= c_customer_sk
        |and     cd_demo_sk              = c_current_cdemo_sk
        |and     hd_demo_sk              = c_current_hdemo_sk
        |and     ca_address_sk           = c_current_addr_sk
        |and     d_year                  = 1999
        |and     d_moy                   = 11
        |and     ( (cd_marital_status       = 'M' and cd_education_status     = 'Unknown')
        |        or(cd_marital_status       = 'W' and cd_education_status     = 'Advanced Degree'))
        |and     hd_buy_potential like '0-500%'
        |and     ca_gmt_offset           = -7
        |group by cc_call_center_id,cc_name,cc_manager,cd_marital_status,cd_education_status
        |order by sum(cr_net_loss) desc
        |""".stripMargin,

    "Q93" ->
      """
        |select ss_customer_sk
        |            ,sum(act_sales) sumsales
        |      from (select ss_item_sk
        |                  ,ss_ticket_number
        |                  ,ss_customer_sk
        |                  ,case when sr_return_quantity is not null then (ss_quantity-sr_return_quantity)*ss_sales_price
        |                                                            else (ss_quantity*ss_sales_price) end act_sales
        |            from store_sales left outer join store_returns on (sr_item_sk = ss_item_sk
        |                                                               and sr_ticket_number = ss_ticket_number)
        |                ,reason
        |            where sr_reason_sk = r_reason_sk
        |              and r_reason_desc = 'Did not like the warranty') t
        |      group by ss_customer_sk
        |      order by sumsales, ss_customer_sk
        |""".stripMargin,

    "Q96" ->
      """
        |select count(*)
        |from store_sales
        |    ,household_demographics
        |    ,time_dim, store
        |where ss_sold_time_sk = time_dim.t_time_sk
        |    and ss_hdemo_sk = household_demographics.hd_demo_sk
        |    and ss_store_sk = s_store_sk
        |    and time_dim.t_hour = 8
        |    and time_dim.t_minute >= 30
        |    and household_demographics.hd_dep_count = 5
        |    and store.s_store_name = 'ese'
        |order by count(*)
        |""".stripMargin,

    "Q97" ->
      """
        |with ssci as (
        |select ss_customer_sk customer_sk
        |      ,ss_item_sk item_sk
        |from store_sales,date_dim
        |where ss_sold_date_sk = d_date_sk
        |  and d_month_seq between 1212 and 1212 + 11
        |group by ss_customer_sk
        |        ,ss_item_sk),
        |csci as(
        | select cs_bill_customer_sk customer_sk
        |      ,cs_item_sk item_sk
        |from catalog_sales,date_dim
        |where cs_sold_date_sk = d_date_sk
        |  and d_month_seq between 1212 and 1212 + 11
        |group by cs_bill_customer_sk
        |        ,cs_item_sk)
        | select sum(case when ssci.customer_sk is not null and csci.customer_sk is null then 1 else 0 end) store_only
        |      ,sum(case when ssci.customer_sk is null and csci.customer_sk is not null then 1 else 0 end) catalog_only
        |      ,sum(case when ssci.customer_sk is not null and csci.customer_sk is not null then 1 else 0 end) store_and_catalog
        |from ssci full outer join csci on (ssci.customer_sk=csci.customer_sk
        |                               and ssci.item_sk = csci.item_sk)
        |""".stripMargin,

    "Q99" ->
      """
        |select
        |   substr(w_warehouse_name,1,20)
        |  ,sm_type
        |  ,cc_name
        |  ,sum(case when (cs_ship_date_sk - cs_sold_date_sk <= 30 ) then 1 else 0 end)  as _30_days
        |  ,sum(case when (cs_ship_date_sk - cs_sold_date_sk > 30) and
        |                 (cs_ship_date_sk - cs_sold_date_sk <= 60) then 1 else 0 end )  as _31_60_days
        |  ,sum(case when (cs_ship_date_sk - cs_sold_date_sk > 60) and
        |                 (cs_ship_date_sk - cs_sold_date_sk <= 90) then 1 else 0 end)  as _61_90_days
        |  ,sum(case when (cs_ship_date_sk - cs_sold_date_sk > 90) and
        |                 (cs_ship_date_sk - cs_sold_date_sk <= 120) then 1 else 0 end)  as _91_120_days
        |  ,sum(case when (cs_ship_date_sk - cs_sold_date_sk  > 120) then 1 else 0 end)  as _120_days
        |from
        |   catalog_sales
        |  ,warehouse
        |  ,ship_mode
        |  ,call_center
        |  ,date_dim
        |where
        |    d_month_seq between 1212 and 1212 + 11
        |and cs_ship_date_sk   = d_date_sk
        |and cs_warehouse_sk   = w_warehouse_sk
        |and cs_ship_mode_sk   = sm_ship_mode_sk
        |and cs_call_center_sk = cc_call_center_sk
        |group by
        |   substr(w_warehouse_name,1,20)
        |  ,sm_type
        |  ,cc_name
        |order by substr(w_warehouse_name,1,20)
        |        ,sm_type
        |        ,cc_name
        |""".stripMargin
  )

  def main(args: Array[String]) {
    val path = args(0)

    writeParquet(path)
    loadParquet(path)
//    loadCsv(path)
//    initHive()
    run(s"tpcds-times.txt", path)
  }
}
