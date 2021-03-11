CREATE TABLE IF NOT EXISTS `user`
(
    `id`               BIGINT      NOT NULL auto_increment,
    `user_name`        VARCHAR(64) NOT NULL,
    `password`         VARCHAR(64) NOT NULL,
    `is_delete`        Boolean     NOT NULL                             DEFAULT false,
    `last_modify_time` timestamp   NOT NULL ON UPDATE CURRENT_TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    `create_time`      timestamp   NOT NULL                             DEFAULT CURRENT_TIMESTAMP,
    primary key (`id`)
);