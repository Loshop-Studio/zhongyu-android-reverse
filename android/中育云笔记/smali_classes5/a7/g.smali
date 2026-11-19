.class public abstract La7/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Landroid/content/ContentValues;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const-string v3, "IMG_"

    .line 24
    .line 25
    const-string v4, "_display_name"

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-static {v3}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v1, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v2, "."

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v6, -0x1

    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    invoke-static {v3}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v1, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, ""

    .line 63
    .line 64
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v1, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_2

    .line 76
    .line 77
    const-string p0, "video"

    .line 78
    .line 79
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    :cond_2
    const-string p1, "image/jpeg"

    .line 86
    .line 87
    :cond_3
    const-string p0, "mime_type"

    .line 88
    .line 89
    invoke-virtual {v1, p0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, La7/j;->e()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    const-string p0, "datetaken"

    .line 99
    .line 100
    invoke-virtual {v1, p0, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string p0, "relative_path"

    .line 104
    .line 105
    const-string p1, "DCIM/Camera"

    .line 106
    .line 107
    invoke-virtual {v1, p0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    return-object v1
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La7/q;->g(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Landroid/content/ContentValues;

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    invoke-direct {v1, v2}, Landroid/content/ContentValues;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const-string v3, "VID_"

    .line 24
    .line 25
    const-string v4, "_display_name"

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-static {v3}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v1, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v2, "."

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const/4 v6, -0x1

    .line 44
    if-ne v5, v6, :cond_1

    .line 45
    .line 46
    invoke-static {v3}, La7/d;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {v1, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    invoke-virtual {p0, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    const-string v3, ""

    .line 63
    .line 64
    invoke-virtual {p0, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {v1, v4, p0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-nez p0, :cond_2

    .line 76
    .line 77
    const-string p0, "image"

    .line 78
    .line 79
    invoke-virtual {p1, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    :cond_2
    const-string p1, "video/mp4"

    .line 86
    .line 87
    :cond_3
    const-string p0, "mime_type"

    .line 88
    .line 89
    invoke-virtual {v1, p0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {}, La7/j;->e()Z

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    if-eqz p0, :cond_4

    .line 97
    .line 98
    const-string p0, "datetaken"

    .line 99
    .line 100
    invoke-virtual {v1, p0, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string p0, "relative_path"

    .line 104
    .line 105
    sget-object p1, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v1, p0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    return-object v1
.end method

.method public static c(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)Landroid/net/Uri;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->U:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->U:Ljava/lang/String;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide v1

    .line 28
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "_"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->U:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :goto_0
    invoke-static {}, La7/j;->e()Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    iget-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 52
    .line 53
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_3

    .line 58
    .line 59
    iget-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->h:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p0, v0, v1}, La7/g;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    const/4 v0, 0x0

    .line 73
    :goto_1
    iput-object v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    iget-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 79
    .line 80
    const/4 v3, 0x1

    .line 81
    invoke-static {p0, v3, v0, v1, v2}, La7/i;->b(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iput-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {p0, v0}, La7/i;->p(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0
.end method

.method public static d(Landroid/content/Context;Lcom/luck/picture/lib/config/PictureSelectionConfig;)Landroid/net/Uri;
    .locals 4

    .line 1
    iget-object v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->V:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, ""

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object v0, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-boolean v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->d:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->V:Ljava/lang/String;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v2, "_"

    .line 33
    .line 34
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->V:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    invoke-static {}, La7/j;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_3

    .line 51
    .line 52
    iget-object v2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iget-object v2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->i:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {p0, v0, v2}, La7/g;->f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-eqz p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :cond_2
    iput-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    iget-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->g:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v2, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->X:Ljava/lang/String;

    .line 78
    .line 79
    const/4 v3, 0x2

    .line 80
    invoke-static {p0, v3, v0, v1, v2}, La7/i;->b(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iput-object v1, p1, Lcom/luck/picture/lib/config/PictureSelectionConfig;->f0:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p0, v0}, La7/i;->p(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    return-object p0
.end method

.method public static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [Landroid/net/Uri;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p1, p2}, La7/g;->a(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "mounted"

    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 33
    .line 34
    invoke-virtual {p0, p2, p1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    aput-object p0, v0, v2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p2, Landroid/provider/MediaStore$Images$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 46
    .line 47
    invoke-virtual {p0, p2, p1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    aput-object p0, v0, v2

    .line 52
    .line 53
    :goto_0
    aget-object p0, v0, v2

    .line 54
    .line 55
    return-object p0
.end method

.method public static f(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    new-array v0, v0, [Landroid/net/Uri;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    aput-object v1, v0, v2

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {p1, p2}, La7/g;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/content/ContentValues;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p2, "mounted"

    .line 21
    .line 22
    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    sget-object p2, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 33
    .line 34
    invoke-virtual {p0, p2, p1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    aput-object p0, v0, v2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    sget-object p2, Landroid/provider/MediaStore$Video$Media;->INTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 46
    .line 47
    invoke-virtual {p0, p2, p1}, Landroid/content/ContentResolver;->insert(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    aput-object p0, v0, v2

    .line 52
    .line 53
    :goto_0
    aget-object p0, v0, v2

    .line 54
    .line 55
    return-object p0
.end method
