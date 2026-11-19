.class public abstract La7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;[Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 7
    .line 8
    const/16 v2, 0x1a

    .line 9
    .line 10
    if-lt v1, v2, :cond_0

    .line 11
    .line 12
    const-string v1, "android:query-arg-sql-selection"

    .line 13
    .line 14
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const-string p0, "android:query-arg-sql-selection-args"

    .line 18
    .line 19
    invoke-virtual {v0, p0, p1}, Landroid/os/BaseBundle;->putStringArray(Ljava/lang/String;[Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string p0, "android:query-arg-sql-sort-order"

    .line 23
    .line 24
    invoke-virtual {v0, p0, p4}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, La7/j;->f()Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    new-instance p0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p1, " offset "

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-string p1, "android:query-arg-sql-limit"

    .line 54
    .line 55
    invoke-virtual {v0, p1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, p1, v0, v0}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :catch_0
    move-exception p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    const-string p0, "Camera"

    .line 22
    .line 23
    return-object p0
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Lo6/b;
    .locals 3

    .line 1
    new-instance v0, Lo6/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lo6/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v1, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_2

    .line 27
    :catch_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    invoke-virtual {v1, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    const/16 p0, 0x9

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, La7/q;->e(Ljava/lang/Object;)J

    .line 39
    .line 40
    .line 41
    move-result-wide p0

    .line 42
    invoke-virtual {v0, p0, p1}, Lo6/b;->d(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :goto_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :goto_2
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;)I
    .locals 9

    .line 1
    const-string v0, "%"

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    :try_start_0
    const-string v6, "_data like ?"

    .line 6
    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    filled-new-array {p1}, [Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {}, La7/j;->f()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    const/4 v0, 0x1

    .line 34
    if-eqz p1, :cond_0

    .line 35
    .line 36
    const-string p1, "_id DESC"

    .line 37
    .line 38
    const/4 v3, 0x0

    .line 39
    invoke-static {v6, v7, v0, v3, p1}, La7/h;->a(Ljava/lang/String;[Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    sget-object v3, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 52
    .line 53
    invoke-static {p0, v3, v2, p1, v2}, Ls6/c;->a(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    :goto_0
    move-object v2, p0

    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    move-object p0, v0

    .line 61
    goto :goto_3

    .line 62
    :catch_0
    move-exception v0

    .line 63
    move-object p0, v0

    .line 64
    goto :goto_2

    .line 65
    :cond_0
    const-string v8, "_id DESC limit 1 offset 0"

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_0

    .line 83
    :goto_1
    if-eqz v2, :cond_2

    .line 84
    .line 85
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-lez p0, :cond_2

    .line 90
    .line 91
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    const-string p0, "_id"

    .line 98
    .line 99
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getInt(I)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    const-string p1, "date_added"

    .line 108
    .line 109
    invoke-interface {v2, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-interface {v2, p1}, Landroid/database/Cursor;->getLong(I)J

    .line 114
    .line 115
    .line 116
    move-result-wide v3

    .line 117
    invoke-static {v3, v4}, La7/d;->a(J)I

    .line 118
    .line 119
    .line 120
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    if-gt p1, v0, :cond_1

    .line 122
    .line 123
    move v1, p0

    .line 124
    :cond_1
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 125
    .line 126
    .line 127
    return v1

    .line 128
    :cond_2
    if-eqz v2, :cond_3

    .line 129
    .line 130
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 131
    .line 132
    .line 133
    :cond_3
    return v1

    .line 134
    :goto_2
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 135
    .line 136
    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 140
    .line 141
    .line 142
    :cond_4
    return v1

    .line 143
    :goto_3
    if-eqz v2, :cond_5

    .line 144
    .line 145
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 146
    .line 147
    .line 148
    :cond_5
    throw p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;)Lo6/b;
    .locals 4

    .line 1
    new-instance v0, Lo6/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lo6/b;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    :try_start_0
    new-instance v2, Landroid/graphics/BitmapFactory$Options;

    .line 8
    .line 9
    invoke-direct {v2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    iput-boolean v3, v2, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 14
    .line 15
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p0, p1}, Lk6/b;->a(Landroid/content/Context;Landroid/net/Uri;)Ljava/io/InputStream;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_2

    .line 32
    :catch_0
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    new-instance p0, Ljava/io/FileInputStream;

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    :goto_0
    :try_start_1
    invoke-static {p0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 40
    .line 41
    .line 42
    iget p1, v2, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Lo6/b;->g(I)V

    .line 45
    .line 46
    .line 47
    iget p1, v2, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Lo6/b;->e(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, La7/i;->a(Ljava/io/Closeable;)V

    .line 53
    .line 54
    .line 55
    return-object v0

    .line 56
    :catchall_1
    move-exception p1

    .line 57
    move-object v1, p0

    .line 58
    move-object p0, p1

    .line 59
    goto :goto_2

    .line 60
    :catch_1
    move-exception p1

    .line 61
    move-object v1, p0

    .line 62
    move-object p0, p1

    .line 63
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 64
    .line 65
    .line 66
    invoke-static {v1}, La7/i;->a(Ljava/io/Closeable;)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :goto_2
    invoke-static {v1}, La7/i;->a(Ljava/io/Closeable;)V

    .line 71
    .line 72
    .line 73
    throw p0
.end method

.method public static g(Ljava/io/File;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Ljava/net/URLConnection;->getFileNameMap()Ljava/net/FileNameMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {v0, p0}, Ljava/net/FileNameMap;->getContentTypeFor(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v1, v0}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    new-instance v0, Ljava/io/File;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, La7/h;->g(Ljava/io/File;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :cond_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const-string p0, "image/jpeg"

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    return-object v0
.end method

.method public static i(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Long;
    .locals 11

    .line 1
    const-string v0, "%"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [Ljava/lang/Long;

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v2, v1, v3

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aput-object v2, v1, v4

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    :try_start_0
    const-string v8, "_data like ?"

    .line 20
    .line 21
    new-instance v5, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    filled-new-array {p1}, [Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    invoke-static {}, La7/j;->f()Z

    .line 44
    .line 45
    .line 46
    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    const-string v0, "external"

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    :try_start_1
    const-string p1, "_id DESC"

    .line 52
    .line 53
    invoke-static {v8, v9, v4, v3, p1}, La7/h;->a(Ljava/lang/String;[Ljava/lang/String;IILjava/lang/String;)Landroid/os/Bundle;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {v0}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {p0, v0, v2, p1, v2}, Ls6/c;->a(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Landroid/os/Bundle;Landroid/os/CancellationSignal;)Landroid/database/Cursor;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    :goto_0
    move-object v2, p0

    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception v0

    .line 72
    move-object p0, v0

    .line 73
    goto :goto_3

    .line 74
    :catch_0
    move-exception v0

    .line 75
    move-object p0, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_0
    const-string v10, "_id DESC limit 1 offset 0"

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    invoke-static {v0}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    const/4 v7, 0x0

    .line 88
    invoke-virtual/range {v5 .. v10}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    goto :goto_0

    .line 93
    :goto_1
    if-eqz v2, :cond_1

    .line 94
    .line 95
    invoke-interface {v2}, Landroid/database/Cursor;->getCount()I

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    if-lez p0, :cond_1

    .line 100
    .line 101
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_1

    .line 106
    .line 107
    const-string p0, "_id"

    .line 108
    .line 109
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getLong(I)J

    .line 114
    .line 115
    .line 116
    move-result-wide p0

    .line 117
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    aput-object p0, v1, v3

    .line 122
    .line 123
    const-string p0, "bucket_id"

    .line 124
    .line 125
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 126
    .line 127
    .line 128
    move-result p0

    .line 129
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getLong(I)J

    .line 130
    .line 131
    .line 132
    move-result-wide p0

    .line 133
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    aput-object p0, v1, v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    .line 139
    :cond_1
    if-eqz v2, :cond_2

    .line 140
    .line 141
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :goto_2
    :try_start_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 146
    .line 147
    .line 148
    if-eqz v2, :cond_2

    .line 149
    .line 150
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 151
    .line 152
    .line 153
    :cond_2
    return-object v1

    .line 154
    :goto_3
    if-eqz v2, :cond_3

    .line 155
    .line 156
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    .line 157
    .line 158
    .line 159
    :cond_3
    throw p0
.end method

.method public static j(JLjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p2}, Ll6/c;->h(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p2}, Ll6/c;->i(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object p2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-static {p2}, Ll6/c;->d(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_2

    .line 24
    .line 25
    sget-object p2, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const-string p2, "external"

    .line 29
    .line 30
    invoke-static {p2}, Landroid/provider/MediaStore$Files;->getContentUri(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :goto_0
    invoke-static {p2, p0, p1}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method

.method public static k(Landroid/content/Context;Ljava/lang/String;)Lo6/b;
    .locals 5

    .line 1
    new-instance v0, Lo6/b;

    .line 2
    .line 3
    invoke-direct {v0}, Lo6/b;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/media/MediaMetadataRetriever;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-static {p1}, Ll6/c;->c(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v1, p0, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Landroid/content/Context;Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_4

    .line 27
    :catch_0
    move-exception p0

    .line 28
    goto :goto_3

    .line 29
    :cond_0
    invoke-virtual {v1, p1}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    const/16 p0, 0x18

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const-string p1, "90"

    .line 39
    .line 40
    invoke-static {p1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    const/16 v2, 0x13

    .line 45
    .line 46
    const/16 v3, 0x12

    .line 47
    .line 48
    if-nez p1, :cond_2

    .line 49
    .line 50
    const-string p1, "270"

    .line 51
    .line 52
    invoke-static {p1, p0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {v1, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p1}, La7/q;->c(Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    invoke-virtual {v1, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, La7/q;->c(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    :goto_1
    invoke-virtual {v1, v3}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-static {p1}, La7/q;->c(Ljava/lang/Object;)I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-virtual {v1, v2}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-static {v2}, La7/q;->c(Ljava/lang/Object;)I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    move v4, v2

    .line 93
    move v2, p1

    .line 94
    move p1, v4

    .line 95
    :goto_2
    invoke-virtual {v0, p1}, Lo6/b;->g(I)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v2}, Lo6/b;->e(I)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, p0}, Lo6/b;->f(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/16 p0, 0x9

    .line 105
    .line 106
    invoke-virtual {v1, p0}, Landroid/media/MediaMetadataRetriever;->extractMetadata(I)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-static {p0}, La7/q;->e(Ljava/lang/Object;)J

    .line 111
    .line 112
    .line 113
    move-result-wide p0

    .line 114
    invoke-virtual {v0, p0, p1}, Lo6/b;->d(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 118
    .line 119
    .line 120
    return-object v0

    .line 121
    :goto_3
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :goto_4
    invoke-virtual {v1}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 129
    .line 130
    .line 131
    throw p0
.end method

.method public static l(Landroid/content/Context;Ljava/lang/String;Lq6/b;)V
    .locals 1

    .line 1
    new-instance v0, La7/h$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, La7/h$a;-><init>(Landroid/content/Context;Ljava/lang/String;Lq6/b;)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/luck/picture/lib/thread/PictureThreadUtils;->h(Lcom/luck/picture/lib/thread/PictureThreadUtils$e;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static m(II)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p0, :cond_1

    .line 3
    .line 4
    if-gtz p1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    mul-int/lit8 p0, p0, 0x3

    .line 8
    .line 9
    if-le p1, p0, :cond_1

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_1
    :goto_0
    return v0
.end method

.method public static n(Landroid/content/Context;I)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 10
    .line 11
    const-string v1, "_id=?"

    .line 12
    .line 13
    int-to-long v2, p1

    .line 14
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    filled-new-array {p1}, [Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, v0, v1, p1}, Landroid/content/ContentResolver;->delete(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :catch_0
    move-exception p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
