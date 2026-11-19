.class public Lcom/tendcloud/tenddata/du;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile A:Lcom/tendcloud/tenddata/du; = null

.field private static final a:I = 0x0

.field private static final b:I = 0x1

.field private static final c:I = 0x3

.field private static i:Ljava/lang/String; = null

.field private static j:Ljava/lang/String; = "TDpref_cloudcontrol"

.field private static final k:Ljava/lang/String; = "TDpref_config"

.field private static final l:Ljava/lang/String; = "TDpref_last_request_time"

.field private static final m:Ljava/lang/String; = "TDpref_cloud_cv"

.field private static n:[Ljava/lang/String;

.field private static o:Z

.field private static p:Z

.field private static q:Z

.field private static r:Z

.field private static s:Ljava/lang/String;

.field private static t:Ljava/lang/String;

.field private static u:Ljava/lang/String;

.field private static v:Ljava/lang/String;

.field private static w:Z

.field private static z:Z


# instance fields
.field private d:J

.field private e:J

.field private f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private h:Lorg/json/JSONObject;

.field private x:I

.field private y:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 66

    .line 1
    const-string v64, "530"

    .line 2
    .line 3
    const-string v65, "548"

    .line 4
    .line 5
    const-string v1, "232"

    .line 6
    .line 7
    const-string v2, "206"

    .line 8
    .line 9
    const-string v3, "284"

    .line 10
    .line 11
    const-string v4, "280"

    .line 12
    .line 13
    const-string v5, "219"

    .line 14
    .line 15
    const-string v6, "230"

    .line 16
    .line 17
    const-string v7, "238"

    .line 18
    .line 19
    const-string v8, "248"

    .line 20
    .line 21
    const-string v9, "244"

    .line 22
    .line 23
    const-string v10, "208"

    .line 24
    .line 25
    const-string v11, "308"

    .line 26
    .line 27
    const-string v12, "340"

    .line 28
    .line 29
    const-string v13, "543"

    .line 30
    .line 31
    const-string v14, "546"

    .line 32
    .line 33
    const-string v15, "547"

    .line 34
    .line 35
    const-string v16, "647"

    .line 36
    .line 37
    const-string v17, "742"

    .line 38
    .line 39
    const-string v18, "262"

    .line 40
    .line 41
    const-string v19, "202"

    .line 42
    .line 43
    const-string v20, "216"

    .line 44
    .line 45
    const-string v21, "272"

    .line 46
    .line 47
    const-string v22, "222"

    .line 48
    .line 49
    const-string v23, "247"

    .line 50
    .line 51
    const-string v24, "246"

    .line 52
    .line 53
    const-string v25, "270"

    .line 54
    .line 55
    const-string v26, "278"

    .line 56
    .line 57
    const-string v27, "204"

    .line 58
    .line 59
    const-string v28, "363"

    .line 60
    .line 61
    const-string v29, "362"

    .line 62
    .line 63
    const-string v30, "260"

    .line 64
    .line 65
    const-string v31, "268"

    .line 66
    .line 67
    const-string v32, "226"

    .line 68
    .line 69
    const-string v33, "231"

    .line 70
    .line 71
    const-string v34, "293"

    .line 72
    .line 73
    const-string v35, "214"

    .line 74
    .line 75
    const-string v36, "240"

    .line 76
    .line 77
    const-string v37, "234"

    .line 78
    .line 79
    const-string v38, "235"

    .line 80
    .line 81
    const-string v39, "266"

    .line 82
    .line 83
    const-string v40, "346"

    .line 84
    .line 85
    const-string v41, "348"

    .line 86
    .line 87
    const-string v42, "350"

    .line 88
    .line 89
    const-string v43, "354"

    .line 90
    .line 91
    const-string v44, "376"

    .line 92
    .line 93
    const-string v45, "750"

    .line 94
    .line 95
    const-string v46, "454"

    .line 96
    .line 97
    const-string v47, "455"

    .line 98
    .line 99
    const-string v48, "466"

    .line 100
    .line 101
    const-string v49, "525"

    .line 102
    .line 103
    const-string v50, "310"

    .line 104
    .line 105
    const-string v51, "311"

    .line 106
    .line 107
    const-string v52, "312"

    .line 108
    .line 109
    const-string v53, "313"

    .line 110
    .line 111
    const-string v54, "314"

    .line 112
    .line 113
    const-string v55, "315"

    .line 114
    .line 115
    const-string v56, "316"

    .line 116
    .line 117
    const-string v57, "330"

    .line 118
    .line 119
    const-string v58, "332"

    .line 120
    .line 121
    const-string v59, "534"

    .line 122
    .line 123
    const-string v60, "535"

    .line 124
    .line 125
    const-string v61, "544"

    .line 126
    .line 127
    const-string v62, "302"

    .line 128
    .line 129
    const-string v63, "505"

    .line 130
    .line 131
    filled-new-array/range {v1 .. v65}, [Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    sput-object v0, Lcom/tendcloud/tenddata/du;->n:[Ljava/lang/String;

    .line 136
    .line 137
    const/4 v0, 0x1

    .line 138
    sput-boolean v0, Lcom/tendcloud/tenddata/du;->p:Z

    .line 139
    .line 140
    const/4 v1, 0x0

    .line 141
    sput-boolean v1, Lcom/tendcloud/tenddata/du;->q:Z

    .line 142
    .line 143
    sput-boolean v0, Lcom/tendcloud/tenddata/du;->r:Z

    .line 144
    .line 145
    sput-boolean v1, Lcom/tendcloud/tenddata/du;->w:Z

    .line 146
    .line 147
    sput-boolean v0, Lcom/tendcloud/tenddata/du;->z:Z

    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    sput-object v0, Lcom/tendcloud/tenddata/du;->A:Lcom/tendcloud/tenddata/du;

    .line 151
    .line 152
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x2d0

    .line 5
    .line 6
    iput-wide v0, p0, Lcom/tendcloud/tenddata/du;->d:J

    .line 7
    .line 8
    const-wide/32 v0, 0x240c8400

    .line 9
    .line 10
    .line 11
    iput-wide v0, p0, Lcom/tendcloud/tenddata/du;->e:J

    .line 12
    .line 13
    new-instance v0, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/tendcloud/tenddata/du;->g:Ljava/util/HashSet;

    .line 26
    .line 27
    new-instance v0, Lorg/json/JSONObject;

    .line 28
    .line 29
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    iput-object v0, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    .line 36
    .line 37
    new-instance v0, Landroid/os/HandlerThread;

    .line 38
    .line 39
    const-string v1, "ModuleCloudControl"

    .line 40
    .line 41
    const/16 v2, 0xa

    .line 42
    .line 43
    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 47
    .line 48
    .line 49
    new-instance v1, Lcom/tendcloud/tenddata/du$1;

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-direct {v1, p0, v0}, Lcom/tendcloud/tenddata/du$1;-><init>(Lcom/tendcloud/tenddata/du;Landroid/os/Looper;)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    .line 59
    .line 60
    return-void
.end method

.method private a(Lcom/tendcloud/tenddata/a;)I
    .locals 1

    .line 92
    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->index()I

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/16 v0, 0x63

    if-eq p1, v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    const/4 p1, 0x4

    return p1

    :cond_1
    return v0

    :cond_2
    const/4 p1, 0x2

    return p1

    :cond_3
    return v0
.end method

.method public static a()Lcom/tendcloud/tenddata/du;
    .locals 2

    .line 4
    sget-object v0, Lcom/tendcloud/tenddata/du;->A:Lcom/tendcloud/tenddata/du;

    if-nez v0, :cond_1

    .line 5
    const-class v0, Lcom/tendcloud/tenddata/du;

    monitor-enter v0

    .line 6
    :try_start_0
    sget-object v1, Lcom/tendcloud/tenddata/du;->A:Lcom/tendcloud/tenddata/du;

    if-nez v1, :cond_0

    .line 7
    new-instance v1, Lcom/tendcloud/tenddata/du;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/du;-><init>()V

    sput-object v1, Lcom/tendcloud/tenddata/du;->A:Lcom/tendcloud/tenddata/du;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 8
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 9
    :cond_1
    :goto_2
    sget-object v0, Lcom/tendcloud/tenddata/du;->A:Lcom/tendcloud/tenddata/du;

    return-object v0
.end method

.method private a(Ljava/io/RandomAccessFile;)Ljava/lang/String;
    .locals 3

    .line 97
    :try_start_0
    invoke-virtual {p1}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v0

    long-to-int v0, v0

    .line 98
    new-array v0, v0, [B

    const-wide/16 v1, 0x0

    .line 99
    invoke-virtual {p1, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 100
    invoke-virtual {p1, v0}, Ljava/io/RandomAccessFile;->read([B)I

    .line 101
    new-instance p1, Ljava/lang/String;

    invoke-direct {p1, v0}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private a(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 6

    .line 36
    const-string v0, "r"

    const-string v1, "TDpref_config"

    const-string v2, "cv"

    .line 37
    :try_start_0
    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object v4, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    const-string v5, ""

    invoke-static {v3, v4, v1, v5}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 38
    invoke-static {v3}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 39
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 40
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v4, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    if-ne v3, v5, :cond_1

    .line 41
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 42
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 43
    invoke-virtual {v4, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 44
    :cond_0
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object v0, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v4

    .line 45
    :cond_1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object v3, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v3, v1, v4}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 47
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object v1, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    const-string v3, "TDpref_cloud_cv"

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    invoke-static {v0, v1, v3, v4, v5}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    :cond_2
    return-object p1

    .line 48
    :cond_3
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object v2, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v1, v3}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/du;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->f()V

    return-void
.end method

.method public static synthetic a(Lcom/tendcloud/tenddata/du;Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2, p3}, Lcom/tendcloud/tenddata/du;->b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V

    return-void
.end method

.method private a(Ljava/io/RandomAccessFile;Ljava/lang/String;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 93
    :try_start_0
    invoke-virtual {p1, v0, v1}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 94
    invoke-virtual {p1, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 95
    invoke-virtual {p2}, Ljava/lang/String;->getBytes()[B

    move-result-object p2

    .line 96
    invoke-virtual {p1, p2}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 5

    .line 49
    :try_start_0
    const-string v0, "clt"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONArray;

    .line 50
    const-string v1, "id"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 51
    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 52
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 53
    invoke-static {v2}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 54
    iget-object v3, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 55
    iget-object v3, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONObject;

    invoke-virtual {v2, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    .line 56
    :cond_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v4, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    :cond_2
    return-void
.end method

.method private a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    if-nez p3, :cond_0

    goto :goto_0

    .line 34
    :cond_0
    :try_start_0
    instance-of v0, p3, Ljava/lang/String;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :goto_0
    return-void
.end method

.method public static synthetic a(Z)Z
    .locals 0

    .line 3
    sput-boolean p0, Lcom/tendcloud/tenddata/du;->z:Z

    return p0
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 8

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    const-string v1, "bl"

    iget v2, p0, Lcom/tendcloud/tenddata/du;->x:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 3
    const-string v1, "pl"

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    const-string v1, "sv"

    const-string v3, "5.0.17"

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 5
    const-string v1, "smcc"

    sget-object v3, Lcom/tendcloud/tenddata/du;->s:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    const-string v1, "smnc"

    sget-object v3, Lcom/tendcloud/tenddata/du;->t:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    const-string v1, "bmcc"

    sget-object v3, Lcom/tendcloud/tenddata/du;->u:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    const-string v1, "bmnc"

    sget-object v3, Lcom/tendcloud/tenddata/du;->v:Ljava/lang/String;

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    const-string v1, "dt"

    const-string v3, "Mobile"

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    const-string v1, "ov"

    invoke-static {}, Lcom/tendcloud/tenddata/cd;->a()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    const-string v1, "av"

    invoke-static {}, Lcom/tendcloud/tenddata/cb;->k()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    const-string v1, "px"

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/tendcloud/tenddata/cd;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 13
    const-string v1, "nt"

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/tendcloud/tenddata/ch;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    const-string v1, "op"

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/tendcloud/tenddata/ch;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    const-string v1, "ch"

    invoke-direct {p0, v0, v1, p2}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    const-string v1, "cv"

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object v4, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    const-string v5, "TDpref_cloud_cv"

    const-wide/16 v6, 0x0

    invoke-static {v3, v4, v5, v6, v7}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    const-string v1, "TDID"

    sget-object v3, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v3}, Lcom/tendcloud/tenddata/cc;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v0, v1, v3}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 19
    const-string v1, "AppID"

    invoke-direct {p0, v0, v1, p1}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    :cond_0
    new-instance v1, Lcom/tendcloud/tenddata/db;

    sget-object v3, Lcom/tendcloud/tenddata/db$a;->JSON:Lcom/tendcloud/tenddata/db$a;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    invoke-direct {v1, v3, v0}, Lcom/tendcloud/tenddata/db;-><init>(Lcom/tendcloud/tenddata/db$a;[B)V

    .line 21
    invoke-static {}, Lcom/tendcloud/tenddata/cz;->a()Lcom/tendcloud/tenddata/da$a;

    move-result-object v0

    sget-object v3, Lcom/tendcloud/tenddata/aa;->M:Ljava/lang/String;

    .line 22
    invoke-virtual {v0, v3}, Lcom/tendcloud/tenddata/da$a;->url(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    move-result-object v0

    const-string v3, "cloud.cpatrk.net"

    .line 23
    invoke-virtual {v0, v3}, Lcom/tendcloud/tenddata/da$a;->host(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    move-result-object v0

    .line 24
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->body(Lcom/tendcloud/tenddata/db;)Lcom/tendcloud/tenddata/da$a;

    move-result-object v0

    new-instance v1, Lcom/tendcloud/tenddata/dc;

    invoke-direct {v1}, Lcom/tendcloud/tenddata/dc;-><init>()V

    const-string v3, "Accept-Encoding"

    const-string v4, ""

    .line 25
    invoke-virtual {v1, v3, v4}, Lcom/tendcloud/tenddata/dc;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/tendcloud/tenddata/dc;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->header(Lcom/tendcloud/tenddata/dc;)Lcom/tendcloud/tenddata/da$a;

    move-result-object v0

    sget-object v1, Lcom/tendcloud/tenddata/dd;->b:Lcom/tendcloud/tenddata/dd;

    .line 26
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->method(Lcom/tendcloud/tenddata/dd;)Lcom/tendcloud/tenddata/da$a;

    move-result-object v0

    .line 27
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/da$a;->build()Lcom/tendcloud/tenddata/da;

    move-result-object v0

    .line 28
    invoke-static {v0}, Lcom/tendcloud/tenddata/cz;->b(Lcom/tendcloud/tenddata/da;)Lcom/tendcloud/tenddata/de;

    move-result-object v0

    .line 29
    sget-object v1, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    invoke-static {v1}, Lcom/tendcloud/tenddata/cg;->getFileLock(Ljava/lang/String;)V

    .line 30
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/de;->c()[B

    move-result-object v1

    invoke-static {v1}, Lcom/tendcloud/tenddata/cq;->c([B)Ljava/lang/String;

    move-result-object v1

    .line 31
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/de;->b()I

    move-result v0

    const/16 v3, 0xc8

    if-ne v0, v3, :cond_1

    .line 32
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/du;->b(Lorg/json/JSONObject;)V

    .line 34
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    sget-object p2, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    const-string p3, "TDpref_last_request_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, p2, p3, v0, v1}, Lcom/tendcloud/tenddata/ck;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)V

    goto :goto_0

    .line 35
    :cond_1
    sget-boolean v0, Lcom/tendcloud/tenddata/du;->z:Z

    if-eqz v0, :cond_3

    .line 36
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 38
    const-string v1, "appId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    :cond_2
    const-string p1, "channelId"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    const-string p1, "Features"

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    iget-object p1, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    invoke-virtual {p1, v2, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 42
    iget-object p2, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    const-wide/16 v0, 0x1388

    invoke-virtual {p2, p1, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :catchall_0
    :cond_3
    :goto_0
    sget-object p1, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    invoke-static {p1}, Lcom/tendcloud/tenddata/cg;->releaseFileLock(Ljava/lang/String;)V

    return-void
.end method

.method private b(Lorg/json/JSONObject;)V
    .locals 8

    .line 44
    const-string v0, "r"

    const-string v1, "c"

    const-string v2, "i"

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 45
    :cond_0
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 46
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    int-to-long v2, v2

    iput-wide v2, p0, Lcom/tendcloud/tenddata/du;->d:J

    .line 47
    :cond_1
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/tendcloud/tenddata/du;->g:Ljava/util/HashSet;

    .line 48
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 49
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 50
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    move v2, v0

    .line 51
    :goto_0
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_4

    .line 52
    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 53
    const-string v4, "id"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    move v5, v0

    .line 54
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_3

    .line 55
    invoke-virtual {p1, v5}, Lorg/json/JSONArray;->getInt(I)I

    move-result v6

    if-ne v4, v6, :cond_2

    .line 56
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {p0, v3, v6}, Lcom/tendcloud/tenddata/du;->a(Lorg/json/JSONObject;Ljava/lang/String;)V

    .line 57
    :cond_2
    iget-object v6, p0, Lcom/tendcloud/tenddata/du;->g:Ljava/util/HashSet;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 58
    :cond_4
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-nez p1, :cond_5

    .line 59
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    .line 60
    :cond_5
    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->g()V

    .line 61
    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_6
    :goto_2
    return-void
.end method

.method private b(Ljava/lang/String;)Z
    .locals 4

    .line 63
    :try_start_0
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    move v0, v1

    .line 64
    :goto_0
    sget-object v2, Lcom/tendcloud/tenddata/du;->n:[Ljava/lang/String;

    array-length v3, v2

    if-ge v0, v3, :cond_2

    .line 65
    aget-object v2, v2, v0

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    :cond_2
    const/4 p1, 0x1

    return p1
.end method

.method private d()V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget v1, p0, Lcom/tendcloud/tenddata/du;->x:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lcom/tendcloud/tenddata/cg$b;->Cloud_Control_Lock_File:Lcom/tendcloud/tenddata/cg$b;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/tendcloud/tenddata/cg$b;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget v1, p0, Lcom/tendcloud/tenddata/du;->x:I

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    :catchall_0
    return-void
.end method

.method private e()Z
    .locals 7

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, "TDpref_last_request_time"

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    cmp-long v2, v0, v3

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    sub-long/2addr v5, v0

    .line 22
    iget-wide v0, p0, Lcom/tendcloud/tenddata/du;->d:J

    .line 23
    .line 24
    const-wide/32 v2, 0xea60

    .line 25
    .line 26
    .line 27
    mul-long/2addr v0, v2

    .line 28
    cmp-long v0, v5, v0

    .line 29
    .line 30
    if-gtz v0, :cond_1

    .line 31
    .line 32
    iget-wide v0, p0, Lcom/tendcloud/tenddata/du;->e:J

    .line 33
    .line 34
    cmp-long v0, v5, v0

    .line 35
    .line 36
    if-lez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    return v0

    .line 41
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 42
    return v0
.end method

.method private f()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/tendcloud/tenddata/cz;->a()Lcom/tendcloud/tenddata/da$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "cloud.cpatrk.net"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->host(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sget-object v1, Lcom/tendcloud/tenddata/aa;->S:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->url(Ljava/lang/String;)Lcom/tendcloud/tenddata/da$a;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v1, Lcom/tendcloud/tenddata/dd;->a:Lcom/tendcloud/tenddata/dd;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/tendcloud/tenddata/da$a;->method(Lcom/tendcloud/tenddata/dd;)Lcom/tendcloud/tenddata/da$a;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/da$a;->build()Lcom/tendcloud/tenddata/da;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lcom/tendcloud/tenddata/cz;->b(Lcom/tendcloud/tenddata/da;)Lcom/tendcloud/tenddata/de;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/de;->b()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/16 v2, 0xc8

    .line 38
    .line 39
    if-eq v1, v2, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v1, Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/tendcloud/tenddata/de;->c()[B

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([B)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lorg/json/JSONObject;

    .line 52
    .line 53
    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v1, "GDPRregion"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    sput-boolean v0, Lcom/tendcloud/tenddata/du;->p:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    :catchall_0
    :cond_1
    :goto_0
    return-void
.end method

.method private g()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONObject;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    sget-object v0, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0}, Lcom/tendcloud/tenddata/cg;->b(Ljava/lang/String;)Ljava/io/RandomAccessFile;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/du;->a(Ljava/io/RandomAccessFile;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Lorg/json/JSONObject;

    .line 26
    .line 27
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-lez v0, :cond_1

    .line 39
    .line 40
    iput-object v1, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    :catchall_0
    :cond_1
    return-void
.end method

.method private h()V
    .locals 4

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cg;->getFileLock(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    .line 7
    .line 8
    sget-object v1, Lcom/tendcloud/tenddata/du;->j:Ljava/lang/String;

    .line 9
    .line 10
    const-string v2, "TDpref_config"

    .line 11
    .line 12
    const-string v3, ""

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, Lcom/tendcloud/tenddata/ck;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    new-instance v1, Lorg/json/JSONObject;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v1, 0x0

    .line 31
    :goto_0
    invoke-direct {p0, v1}, Lcom/tendcloud/tenddata/du;->b(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    :catchall_0
    sget-object v0, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0}, Lcom/tendcloud/tenddata/cg;->releaseFileLock(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private i()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_3

    .line 12
    .line 13
    iget-object v1, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Ljava/lang/String;

    .line 45
    .line 46
    iget-object v5, p0, Lcom/tendcloud/tenddata/du;->g:Ljava/util/HashSet;

    .line 47
    .line 48
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_1

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v2, 0x0

    .line 59
    :goto_1
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-ge v2, v4, :cond_0

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    check-cast v4, Ljava/lang/String;

    .line 70
    .line 71
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    .line 74
    add-int/lit8 v2, v2, 0x1

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    :cond_3
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lorg/json/JSONArray;
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-virtual {p0, p1, v0, v0}, Lcom/tendcloud/tenddata/du;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    move-result-object p1

    return-object p1
.end method

.method public a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lorg/json/JSONArray;
    .locals 12

    .line 58
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 59
    sget-boolean v1, Lcom/tendcloud/tenddata/du;->w:Z

    if-nez v1, :cond_0

    goto/16 :goto_1

    .line 60
    :cond_0
    :try_start_0
    sget-boolean v1, Lcom/tendcloud/tenddata/ab;->q:Z

    if-eqz v1, :cond_1

    goto/16 :goto_1

    .line 61
    :cond_1
    sget-boolean v1, Lcom/tendcloud/tenddata/du;->q:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    sget-boolean v1, Lcom/tendcloud/tenddata/du;->r:Z

    if-eqz v1, :cond_2

    .line 62
    sget-boolean p1, Lcom/tendcloud/tenddata/du;->p:Z

    if-eqz p1, :cond_d

    return-object v2

    .line 63
    :cond_2
    iget-object v1, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    .line 64
    sget-boolean p1, Lcom/tendcloud/tenddata/du;->o:Z

    if-eqz p1, :cond_3

    goto/16 :goto_1

    :cond_3
    return-object v2

    :cond_4
    const/4 v1, 0x1

    if-eqz p2, :cond_7

    if-eqz p3, :cond_7

    .line 65
    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    goto/16 :goto_1

    .line 66
    :cond_5
    invoke-virtual {p3, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_6

    return-object v2

    .line 67
    :cond_6
    invoke-virtual {p3, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 68
    :cond_7
    iget-object p2, p0, Lcom/tendcloud/tenddata/du;->f:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lorg/json/JSONObject;

    .line 69
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object p3

    .line 70
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 71
    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->g()V

    .line 72
    :cond_8
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    .line 73
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 74
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 76
    const-string v6, "st"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v6

    .line 77
    const-string v8, "et"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 78
    const-string v10, "cn"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 79
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    cmp-long v6, v10, v6

    if-ltz v6, :cond_8

    cmp-long v6, v10, v8

    if-gtz v6, :cond_8

    if-gtz v5, :cond_9

    goto :goto_0

    .line 80
    :cond_9
    iget-object v6, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    invoke-virtual {v6, p1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 81
    iget-object v6, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    invoke-virtual {v6, p1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    .line 82
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 83
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    if-ge v7, v5, :cond_8

    .line 84
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    .line 85
    invoke-virtual {v6, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    add-int/2addr v5, v1

    invoke-virtual {v6, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 86
    iget-object v4, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    invoke-virtual {v4, p1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    .line 87
    :cond_a
    iget-object v5, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    invoke-virtual {v6, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v5, p1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 88
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    goto :goto_0

    .line 89
    :cond_b
    iget-object v5, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    new-instance v6, Lorg/json/JSONObject;

    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v6, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v5, p1, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v0, v4}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;

    goto/16 :goto_0

    .line 91
    :cond_c
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_d

    return-object v2

    :catchall_0
    :cond_d
    :goto_1
    return-object v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/tendcloud/tenddata/a;)V
    .locals 5

    .line 10
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    const-string v1, "appId"

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    invoke-static {p2}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p2, "Default"

    :cond_0
    const-string p1, "channelId"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    const-string p1, "Features"

    invoke-virtual {v0, p1, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    invoke-direct {p0, p3}, Lcom/tendcloud/tenddata/du;->a(Lcom/tendcloud/tenddata/a;)I

    move-result p1

    iput p1, p0, Lcom/tendcloud/tenddata/du;->x:I

    .line 15
    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->d()V

    .line 16
    invoke-static {p3}, Lcom/tendcloud/tenddata/cb;->e(Lcom/tendcloud/tenddata/a;)J

    move-result-wide p1

    const-wide/16 v1, 0x1

    cmp-long p1, p1, v1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez p1, :cond_1

    move p1, p2

    goto :goto_0

    :cond_1
    move p1, p3

    :goto_0
    sput-boolean p1, Lcom/tendcloud/tenddata/du;->q:Z

    const/4 v1, 0x3

    if-eqz p1, :cond_3

    .line 17
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->h(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_2

    .line 18
    sget-object p1, Lcom/tendcloud/tenddata/co;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance p3, Lcom/tendcloud/tenddata/du$2;

    invoke-direct {p3, p0}, Lcom/tendcloud/tenddata/du$2;-><init>(Lcom/tendcloud/tenddata/du;)V

    invoke-virtual {p1, p3}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 19
    iget-object p1, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    invoke-virtual {p1, v1, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p3

    const-wide/16 v0, 0x1388

    invoke-virtual {p1, p3, v0, v1}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 20
    sput-boolean p2, Lcom/tendcloud/tenddata/du;->w:Z

    return-void

    .line 21
    :cond_2
    sput-boolean p3, Lcom/tendcloud/tenddata/du;->r:Z

    .line 22
    :cond_3
    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {p1}, Lcom/tendcloud/tenddata/ch;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    .line 23
    sget-object v2, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-static {v2}, Lcom/tendcloud/tenddata/ch;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 24
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v3

    const-string v4, ""

    if-eqz v3, :cond_4

    move-object v3, v4

    goto :goto_1

    :cond_4
    invoke-virtual {p1, p3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    :goto_1
    sput-object v3, Lcom/tendcloud/tenddata/du;->s:Ljava/lang/String;

    .line 25
    invoke-static {p1}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    move-object p1, v4

    goto :goto_2

    :cond_5
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :goto_2
    sput-object p1, Lcom/tendcloud/tenddata/du;->t:Ljava/lang/String;

    .line 26
    invoke-static {v2}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    move-object p1, v4

    goto :goto_3

    :cond_6
    invoke-virtual {v2, p3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :goto_3
    sput-object p1, Lcom/tendcloud/tenddata/du;->u:Ljava/lang/String;

    .line 27
    invoke-static {v2}, Lcom/tendcloud/tenddata/cq;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v2, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    :goto_4
    sput-object v4, Lcom/tendcloud/tenddata/du;->v:Ljava/lang/String;

    .line 28
    sget-object p1, Lcom/tendcloud/tenddata/du;->s:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/du;->b(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_9

    sget-object p1, Lcom/tendcloud/tenddata/du;->u:Ljava/lang/String;

    invoke-direct {p0, p1}, Lcom/tendcloud/tenddata/du;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_8

    goto :goto_5

    :cond_8
    move p1, p3

    goto :goto_6

    :cond_9
    :goto_5
    move p1, p2

    :goto_6
    sput-boolean p1, Lcom/tendcloud/tenddata/du;->o:Z

    .line 29
    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->h()V

    .line 30
    :try_start_0
    sget-boolean p1, Lcom/tendcloud/tenddata/ab;->q:Z

    if-nez p1, :cond_a

    invoke-direct {p0}, Lcom/tendcloud/tenddata/du;->e()Z

    move-result p1

    if-eqz p1, :cond_b

    .line 31
    :cond_a
    iget-object p1, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    invoke-virtual {p1, p3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    .line 32
    iget-object p3, p0, Lcom/tendcloud/tenddata/du;->y:Landroid/os/Handler;

    invoke-virtual {p3, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    :catchall_0
    :cond_b
    sput-boolean p2, Lcom/tendcloud/tenddata/du;->w:Z

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 62
    sget-object v0, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    return-object v0
.end method

.method public c()V
    .locals 2

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/du;->i:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/tendcloud/tenddata/cg;->b(Ljava/lang/String;)Ljava/io/RandomAccessFile;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    .line 8
    .line 9
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v0, v1}, Lcom/tendcloud/tenddata/du;->a(Ljava/io/RandomAccessFile;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lcom/tendcloud/tenddata/du;->h:Lorg/json/JSONObject;

    .line 22
    .line 23
    return-void
.end method
