.class public abstract Lp9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/util/Properties;

.field public static b:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Properties;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Properties;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp9/b;->a:Ljava/util/Properties;

    .line 7
    .line 8
    return-void
.end method

.method public static a(I)I
    .locals 2

    .line 1
    int-to-float p0, p0

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-static {v1, p0, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method

.method public static b()Z
    .locals 6

    .line 1
    sget-object v0, Lp9/b;->b:Ljava/lang/Boolean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 11
    .line 12
    const/16 v1, 0x1a

    .line 13
    .line 14
    const-string v2, "ro.miui.ui.version.name"

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-ge v0, v1, :cond_3

    .line 18
    .line 19
    :try_start_0
    new-instance v0, Ljava/io/FileInputStream;

    .line 20
    .line 21
    new-instance v1, Ljava/io/File;

    .line 22
    .line 23
    invoke-static {}, Landroid/os/Environment;->getRootDirectory()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "build.prop"

    .line 28
    .line 29
    invoke-direct {v1, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    .line 35
    :try_start_1
    sget-object v1, Lp9/b;->a:Ljava/util/Properties;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    .line 39
    .line 40
    :try_start_2
    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catch_0
    move-exception v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :catchall_0
    move-exception v1

    .line 50
    move-object v3, v0

    .line 51
    goto :goto_2

    .line 52
    :catch_1
    move-exception v1

    .line 53
    move-object v3, v0

    .line 54
    goto :goto_0

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    goto :goto_2

    .line 57
    :catch_2
    move-exception v1

    .line 58
    :goto_0
    :try_start_3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 59
    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    :try_start_4
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_1
    sget-object v0, Lp9/b;->a:Ljava/util/Properties;

    .line 67
    .line 68
    invoke-virtual {v0, v2}, Ljava/util/Properties;->containsKey(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    sput-object v0, Lp9/b;->b:Ljava/lang/Boolean;

    .line 77
    .line 78
    goto :goto_4

    .line 79
    :goto_2
    if-eqz v3, :cond_2

    .line 80
    .line 81
    :try_start_5
    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :catch_3
    move-exception v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_3
    throw v1

    .line 90
    :cond_3
    :try_start_6
    const-string v0, "android.os.SystemProperties"

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    const-string v1, "get"

    .line 97
    .line 98
    const-class v4, Ljava/lang/String;

    .line 99
    .line 100
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-virtual {v0, v1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    invoke-virtual {v0, v3, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    xor-int/lit8 v0, v0, 0x1

    .line 123
    .line 124
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    sput-object v0, Lp9/b;->b:Ljava/lang/Boolean;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :catch_4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 132
    .line 133
    sput-object v0, Lp9/b;->b:Ljava/lang/Boolean;

    .line 134
    .line 135
    :goto_4
    sget-object v0, Lp9/b;->b:Ljava/lang/Boolean;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    return v0
.end method

.method public static c(I)I
    .locals 2

    .line 1
    int-to-float p0, p0

    .line 2
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-static {v1, p0, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    float-to-int p0, p0

    .line 16
    return p0
.end method
