select
  user_id,
  event_id,
  event_name,
  event_personnel,
  event_datetime,
  event_place,
  event_status,
  event_summary,
  delete_flg,
  create_user,
  create_date,
  update_user,
  update_date
FROM
  T_EVENT
ORDER BY event_datetime desc