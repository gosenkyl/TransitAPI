-- Create Schema Here

CREATE TABLE `transit`.`agency` (
  `agency_id` VARCHAR(32) NOT NULL,
  `agency_name` VARCHAR(100) NULL,
  `agency_url` VARCHAR(255) NULL,
  `agency_timezone` VARCHAR(32) NULL,
  `agency_lang` VARCHAR(32) NULL,
  `agency_phone` VARCHAR(32) NULL,
  `agency_fare_url` VARCHAR(255) NULL,
  PRIMARY KEY (`agency_id`));

CREATE TABLE `transit`.`calendar` (
  `calendar_id` VARCHAR(32) NOT NULL,
  `service_id` VARCHAR(32) NOT NULL,
  `monday` TINYINT(1) NOT NULL DEFAULT 0,
  `tuesday` TINYINT(1) NOT NULL DEFAULT 0,
  `wednesday` TINYINT(1) NOT NULL DEFAULT 0,
  `thursday` TINYINT(1) NOT NULL DEFAULT 0,
  `friday` TINYINT(1) NOT NULL DEFAULT 0,
  `saturday` TINYINT(1) NOT NULL DEFAULT 0,
  `sunday` TINYINT(1) NOT NULL DEFAULT 0,
  `start_date` DATE NOT NULL,
  `end_date` DATE NOT NULL,
  PRIMARY KEY (`calendar_id`));

CREATE TABLE `transit`.`calendar_dates` (
  `calendar_dates_id` varchar(32) NOT NULL,
  `service_id` varchar(32) NOT NULL,
  `date` date NOT NULL,
  `exception_type` int(2) NOT NULL DEFAULT '0',
  PRIMARY KEY (`calendar_dates_id`));

CREATE TABLE `transit`.`fare_attributes` (
  `fare_attributes_id` VARCHAR(32) NOT NULL,
  `fare_id` VARCHAR(32) NOT NULL,
  `price` FLOAT NULL,
  `currency_type` VARCHAR(32) NULL,
  `payment_method` INT(1) NULL,
  `transfers` INT(1) NULL,
  `transfer_duration` INT(11) NULL,
  PRIMARY KEY (`fare_attributes_id`));

CREATE TABLE `transit`.`fare_rules` (
  `fare_rules_id` VARCHAR(32) NOT NULL,
  `fare_id` VARCHAR(32) NOT NULL,
  `route_id` VARCHAR(32) NULL,
  `origin_id` VARCHAR(32) NULL,
  `destination_id` VARCHAR(32) NULL,
  `contains_id` VARCHAR(32) NULL,
  PRIMARY KEY (`fare_rules_id`));

CREATE TABLE `transit`.`feed_info` (
  `feed_info_id` VARCHAR(32) NOT NULL,
  `feed_publisher_name` VARCHAR(32) NULL,
  `feed_publisher_url` VARCHAR(32) NULL,
  `feed_lang` VARCHAR(32) NULL,
  `feed_start_date` DATE NULL,
  `feed_end_date` DATE NULL,
  `feed_version` VARCHAR(32) NULL,
  PRIMARY KEY (`feed_info_id`));

CREATE TABLE `transit`.`route` (
  `route_id` VARCHAR(32) NOT NULL,
  `agency_id` VARCHAR(32) NULL,
  `route_short_name` VARCHAR(32) NULL,
  `route_long_name` VARCHAR(32) NULL,
  `route_desc` VARCHAR(32) NULL,
  `route_type` VARCHAR(32) NULL,
  `route_url` VARCHAR(100) NULL,
  `route_color` VARCHAR(32) NULL,
  `route_text_color` VARCHAR(32) NULL,
  PRIMARY KEY (`route_id`));

CREATE TABLE `transit`.`shapes` (
  `shape_id` VARCHAR(32) NOT NULL,
  `shape_pt_lat` DOUBLE NULL,
  `shape_pt_lon` DOUBLE NULL,
  `shape_pt_sequence` INT(11) NULL,
  `shape_dist_traveled` DOUBLE NULL,
  PRIMARY KEY (`shape_id`));

CREATE TABLE `transit`.`stop_times` (
  `stop_times_id` VARCHAR(32) NOT NULL,
  `trip_id` VARCHAR(32) NULL,
  `arrival_time` TIME(0) NULL,
  `departure_time` TIME(0) NULL,
  `stop_id` VARCHAR(32) NULL,
  `stop_sequence` INT(11) NULL,
  `stop_headsign` VARCHAR(100) NULL,
  `pickup_type` INT(1) NULL,
  `drop_off_type` INT(1) NULL,
  `shape_dist_traveled` DOUBLE NULL,
  PRIMARY KEY (`stop_times_id`));

CREATE TABLE `transit`.`stops` (
  `stop_id` VARCHAR(32) NOT NULL,
  `stop_code` VARCHAR(32) NULL,
  `stop_name` VARCHAR(100) NULL,
  `stop_desc` VARCHAR(100) NULL,
  `stop_lat` DOUBLE NULL,
  `stop_lon` DOUBLE NULL,
  `zone_id` VARCHAR(32) NULL,
  `stop_url` VARCHAR(100) NULL,
  `location_type` TINYINT(1) NULL,
  `parent_station` TINYINT(1) NULL,
  `stop_timezone` VARCHAR(32) NULL,
  `wheelchair_boarding` TINYINT(1) NULL,
  PRIMARY KEY (`stop_id`));

CREATE TABLE `transit`.`trips` (
  `trips_id` VARCHAR(32) NOT NULL,
  `route_id` VARCHAR(32) NULL,
  `service_id` VARCHAR(32) NULL,
  `trip_headsign` VARCHAR(100) NULL,
  `trip_short_name` VARCHAR(100) NULL,
  `direction_id` TINYINT(1) NULL,
  `block_id` VARCHAR(32) NULL,
  `shape_id` VARCHAR(32) NULL,
  `wheelchair_accessible` TINYINT(1) NULL,
  `bikes_allowed` TINYINT(1) NULL,
  PRIMARY KEY (`trips_id`));

