# 中育管控桌面 数据操作

方法签名保留 DEX 类型。每行列出方法内直接调用的存储或编解码接口。

| 实现 | 方法 | 操作 |
|---|---|---|
| [com/zykj/download/data/AppDatabase_Impl$a](../../../android/中育管控桌面/smali_classes3/com/zykj/download/data/AppDatabase_Impl$a.smali) | `createAllTables(Landroidx/sqlite/db/SupportSQLiteDatabase;)V` | 执行 SQLite 语句（SupportSQLiteDatabase.execSQL） |
| [com/zykj/download/data/AppDatabase_Impl$a](../../../android/中育管控桌面/smali_classes3/com/zykj/download/data/AppDatabase_Impl$a.smali) | `dropAllTables(Landroidx/sqlite/db/SupportSQLiteDatabase;)V` | 执行 SQLite 语句（SupportSQLiteDatabase.execSQL） |
| [com/zykj/download/data/AppDatabase_Impl](../../../android/中育管控桌面/smali_classes3/com/zykj/download/data/AppDatabase_Impl.smali) | `clearAllTables()V` | 执行 SQLite 语句（SupportSQLiteDatabase.execSQL）、查询 SQLite（SupportSQLiteDatabase.query） |
| [com/zykj/download/work/UploadFileOssWork](../../../android/中育管控桌面/smali_classes3/com/zykj/download/work/UploadFileOssWork.smali) | `initParameter()V` | 读取 JSON（Gson.fromJson） |
| [com/zykj/huiwei/launcher/server/MyFloatingToolService](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/server/MyFloatingToolService.smali) | `u(Ljava/lang/String;)V` | 解码本地图片（BitmapFactory.decodeFile） |
| [com/zykj/huiwei/launcher/ui/MainActivity](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/MainActivity.smali) | `Y(Lcom/zykj/huiwei/launcher/ui/MainActivity;Ljava/util/List;)V` | 写入 JSON（Gson.toJson） |
| [com/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/BaseAppFragment$a.smali) | `onItemDragEnd(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V` | 写入 JSON（Gson.toJson） |
| [com/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel](../../../android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/fragment/applist/BaseAppListViewModel.smali) | `a(Ljava/util/List;)Ljava/util/List;` | 读取 JSON（Gson.fromJson） |
| [com/zykj/policy/ext/PolicyHelper$a](../../../android/中育管控桌面/smali_classes4/com/zykj/policy/ext/PolicyHelper$a.smali) | `b(Landroid/content/Context;)Z` | 读取布尔偏好（SharedPreferences.getBoolean） |
| [com/zykj/policy/ext/PolicyHelper$a](../../../android/中育管控桌面/smali_classes4/com/zykj/policy/ext/PolicyHelper$a.smali) | `c(Landroid/content/Context;Z)V` | 保存布尔偏好（SharedPreferences$Editor.putBoolean） |
