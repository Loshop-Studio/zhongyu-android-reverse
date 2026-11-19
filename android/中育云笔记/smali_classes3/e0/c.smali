.class public Le0/c;
.super Le0/e;
.source "SourceFile"


# static fields
.field public static f:Ljava/util/Random;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Le0/e;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static m(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    const-class v0, Ljava/lang/String;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "android.os.SystemProperties"

    .line 12
    .line 13
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v2, "get"

    .line 18
    .line 19
    invoke-virtual {v1, v2, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    return-object p0

    .line 30
    :catchall_0
    const-string p0, ""

    .line 31
    .line 32
    return-object p0
.end method

.method public static n()Z
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "ro.vivo.os.build.display.id"

    .line 2
    .line 3
    invoke-static {v0}, Le0/c;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 8
    .line 9
    const-string v2, "vivo"

    .line 10
    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    const-string v1, "Funtouch"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string v0, "ro.iqoo.os.build.display.id"

    .line 28
    .line 29
    invoke-static {v0}, Le0/c;->m(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    :cond_1
    :goto_0
    return v2

    .line 46
    :catchall_0
    :cond_2
    const/4 v0, 0x0

    .line 47
    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)Landroid/app/Notification;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    .line 15
    .line 16
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catch_0
    move-exception v1

    .line 20
    const-string v2, "Get system icon error, package name not found, "

    .line 21
    .line 22
    new-array v3, v0, [Ljava/lang/Object;

    .line 23
    .line 24
    const-string v4, "BasicNotificationBuilder"

    .line 25
    .line 26
    invoke-static {v4, v2, v1, v3}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const v1, 0x1080077

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0, v2}, Le0/c;->l(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    new-instance v4, Landroid/app/Notification$Builder;

    .line 47
    .line 48
    invoke-direct {v4, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Le0/e;->b()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v4, p1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p0}, Le0/e;->e()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {p1, v5}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const/4 v1, 0x6

    .line 72
    new-array v1, v1, [J

    .line 73
    .line 74
    fill-array-data v1, :array_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const/4 v1, 0x2

    .line 82
    invoke-static {v1}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;)Landroid/app/Notification$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p0}, Le0/e;->g()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/4 v1, 0x1

    .line 99
    invoke-virtual {p1, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 108
    .line 109
    .line 110
    move-result-wide v5

    .line 111
    invoke-virtual {p1, v5, v6}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    const-string v2, ""

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Le0/e;->k()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-nez p1, :cond_0

    .line 129
    .line 130
    invoke-virtual {p0}, Le0/e;->k()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-virtual {v4, p1}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 135
    .line 136
    .line 137
    :cond_0
    invoke-virtual {v4, v1}, Landroid/app/Notification$Builder;->setShowWhen(Z)Landroid/app/Notification$Builder;

    .line 138
    .line 139
    .line 140
    const/16 p1, 0x1a

    .line 141
    .line 142
    if-lt v3, p1, :cond_1

    .line 143
    .line 144
    invoke-virtual {p0}, Le0/e;->i()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-nez p1, :cond_1

    .line 153
    .line 154
    invoke-virtual {p0}, Le0/e;->i()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-static {v4, p1}, Lcom/alibaba/sdk/android/push/notification/f;->a(Landroid/app/Notification$Builder;Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 159
    .line 160
    .line 161
    :cond_1
    invoke-static {}, Le0/c;->n()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    const-string v2, "group"

    .line 166
    .line 167
    if-eqz p1, :cond_3

    .line 168
    .line 169
    invoke-virtual {v4, v1}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 170
    .line 171
    .line 172
    sget-object p1, Le0/c;->f:Ljava/util/Random;

    .line 173
    .line 174
    if-nez p1, :cond_2

    .line 175
    .line 176
    new-instance p1, Ljava/util/Random;

    .line 177
    .line 178
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 179
    .line 180
    .line 181
    move-result-wide v0

    .line 182
    invoke-direct {p1, v0, v1}, Ljava/util/Random;-><init>(J)V

    .line 183
    .line 184
    .line 185
    sput-object p1, Le0/c;->f:Ljava/util/Random;

    .line 186
    .line 187
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 188
    .line 189
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    sget-object v0, Le0/c;->f:Ljava/util/Random;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {v4, p1}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_3
    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v2}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    .line 216
    .line 217
    .line 218
    :goto_1
    invoke-virtual {v4}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    return-object p1

    .line 223
    :array_0
    .array-data 8
        0x64
        0xfa
        0x64
        0xfa
        0x64
        0xfa
    .end array-data
.end method

.method public final l(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    if-eq v2, v3, :cond_0

    .line 15
    .line 16
    sget-object v2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v2, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 20
    .line 21
    :goto_0
    invoke-static {v0, v1, v2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Landroid/graphics/Canvas;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-virtual {p1, v4, v4, v2, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method
