.class Lcom/tendcloud/tenddata/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/tenddata/s$e;,
        Lcom/tendcloud/tenddata/s$a;,
        Lcom/tendcloud/tenddata/s$d;,
        Lcom/tendcloud/tenddata/s$b;,
        Lcom/tendcloud/tenddata/s$c;
    }
.end annotation


# static fields
.field static a:Lcom/tendcloud/tenddata/s$c; = null

.field private static final b:I = 0x1

.field private static final c:I = 0x2

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static e:Ljava/util/concurrent/CountDownLatch; = null

.field private static j:Ljava/lang/String; = null

.field private static final k:I = 0xff


# instance fields
.field private final f:Lcom/tendcloud/tenddata/s$d;

.field private final g:Lcom/tendcloud/tenddata/s$b;

.field private final h:Landroid/os/Handler;

.field private final i:Lcom/tendcloud/tenddata/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lcom/tendcloud/tenddata/s;->d:Ljava/util/List;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    sput-object v0, Lcom/tendcloud/tenddata/s;->e:Ljava/util/concurrent/CountDownLatch;

    .line 14
    .line 15
    new-instance v0, Lcom/tendcloud/tenddata/s$c;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/tendcloud/tenddata/s$c;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/tendcloud/tenddata/s;->a:Lcom/tendcloud/tenddata/s$c;

    .line 21
    .line 22
    const-string v0, ""

    .line 23
    .line 24
    sput-object v0, Lcom/tendcloud/tenddata/s;->j:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>(Lcom/tendcloud/tenddata/n;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/tenddata/s;->i:Lcom/tendcloud/tenddata/n;

    .line 5
    .line 6
    new-instance p1, Landroid/os/Handler;

    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/tendcloud/tenddata/s;->h:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance p1, Lcom/tendcloud/tenddata/s$d;

    .line 18
    .line 19
    invoke-direct {p1}, Lcom/tendcloud/tenddata/s$d;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/tendcloud/tenddata/s;->f:Lcom/tendcloud/tenddata/s$d;

    .line 23
    .line 24
    new-instance p1, Lcom/tendcloud/tenddata/s$b;

    .line 25
    .line 26
    const/16 v0, 0xff

    .line 27
    .line 28
    invoke-direct {p1, v0}, Lcom/tendcloud/tenddata/s$b;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/tendcloud/tenddata/s;->g:Lcom/tendcloud/tenddata/s$b;

    .line 32
    .line 33
    return-void
.end method

.method public static a(Landroid/graphics/Bitmap;)Ljava/lang/String;
    .locals 3

    .line 176
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 177
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    invoke-virtual {p0, v1, v2, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    .line 178
    const-string p0, "MD5"

    invoke-static {p0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p0

    .line 179
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    .line 180
    invoke-virtual {p0, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    .line 181
    invoke-static {p0}, Lcom/tendcloud/tenddata/cq;->a([B)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 182
    :catchall_0
    const-string p0, ""

    return-object p0
.end method

.method private a(Landroid/view/View;)Ljava/lang/String;
    .locals 2

    const v0, 0x54440001

    .line 155
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 156
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private a(Landroid/view/View;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 157
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 158
    invoke-static {}, Lcom/tendcloud/tenddata/f;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    instance-of v1, v0, Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_0

    .line 159
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p3

    goto :goto_1

    .line 160
    :cond_0
    invoke-static {}, Lcom/tendcloud/tenddata/f;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    instance-of v1, v0, Landroidx/viewpager/widget/ViewPager;

    if-eqz v1, :cond_1

    .line 161
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result p3

    goto :goto_1

    .line 162
    :cond_1
    instance-of v1, v0, Landroid/widget/AdapterView;

    if-eqz v1, :cond_2

    .line 163
    check-cast v0, Landroid/widget/AdapterView;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    move-result p3

    goto :goto_1

    .line 164
    :cond_2
    invoke-static {}, Lcom/tendcloud/tenddata/f;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    instance-of v1, v0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_3

    .line 165
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    if-ltz v0, :cond_4

    goto :goto_0

    .line 166
    :cond_3
    invoke-static {}, Lcom/tendcloud/tenddata/f;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    instance-of v1, v0, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v1, :cond_4

    .line 167
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v0

    if-ltz v0, :cond_4

    :goto_0
    move p3, v0

    .line 168
    :cond_4
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x54440002

    .line 169
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 170
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    goto :goto_2

    .line 171
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    const v1, 0x1020002

    if-ne p1, v1, :cond_6

    .line 172
    const-string v0, "MainContentView"

    .line 173
    :cond_6
    :goto_2
    const-string p1, "/"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string p2, ""

    .line 174
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "["

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 175
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_8

    return-object p1

    :cond_8
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "#"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/s;->d:Ljava/util/List;

    return-object v0
.end method

.method public static synthetic a(Ljava/util/concurrent/CountDownLatch;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 2
    sput-object p0, Lcom/tendcloud/tenddata/s;->e:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method private a(Landroid/util/JsonWriter;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    .line 82
    invoke-static {v0}, Lcom/tendcloud/tenddata/v;->b(Landroid/view/View;)Z

    move-result v3

    if-nez v3, :cond_0

    return-void

    .line 83
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-eq v4, v3, :cond_1

    .line 84
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v3

    const/high16 v6, 0x7f000000

    if-le v3, v6, :cond_1

    if-eq v3, v4, :cond_1

    .line 85
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    :cond_1
    move-object v3, v5

    .line 86
    :goto_0
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 87
    const-string v4, "type"

    invoke-virtual {p1, v4}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 88
    const-string v4, ""

    if-nez v2, :cond_2

    .line 89
    const-string v2, "DecorView[0]"

    const-string v3, "0"

    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    instance-of v6, v6, Landroid/view/ViewGroup;

    if-eqz v6, :cond_3

    .line 91
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    check-cast v5, Landroid/view/ViewGroup;

    .line 92
    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v6

    .line 93
    invoke-direct {p0, v0, v2, v6, v3}, Lcom/tendcloud/tenddata/s;->a(Landroid/view/View;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 94
    const-string v3, "/"

    move-object/from16 v7, p4

    invoke-virtual {v7, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object/from16 v7, p4

    move-object v2, v4

    move-object v3, v7

    .line 95
    :goto_1
    invoke-direct {p0, v0}, Lcom/tendcloud/tenddata/s;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v6

    .line 96
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_4

    move-object/from16 v6, p6

    .line 97
    :cond_4
    const-string v7, "xpath"

    invoke-virtual {p1, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 98
    const-string v7, "level"

    invoke-virtual {p1, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v7

    invoke-virtual {v7, v3}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 99
    const-string v7, "pagePath"

    invoke-virtual {p1, v7}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 100
    const-string v6, "isList"

    invoke-virtual {p1, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v6

    invoke-static {v0}, Lcom/tendcloud/tenddata/v;->d(Landroid/view/View;)Z

    move-result v7

    invoke-virtual {v6, v7}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 101
    const-string v6, "sourceType"

    invoke-virtual {p1, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v6

    const-wide/16 v7, 0x1

    invoke-virtual {v6, v7, v8}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 102
    invoke-static {v0}, Lcom/tendcloud/tenddata/v;->e(Landroid/view/View;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_5

    .line 103
    const-string v6, "isWebView"

    invoke-virtual {p1, v6}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 104
    :cond_5
    invoke-static {v0}, Lcom/tendcloud/tenddata/v;->a(Landroid/view/View;)Ljava/lang/String;

    move-result-object v6

    .line 105
    const-string v8, "value"

    if-nez v6, :cond_6

    .line 106
    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v6

    invoke-virtual {v6}, Landroid/util/JsonWriter;->nullValue()Landroid/util/JsonWriter;

    goto :goto_2

    .line 107
    :cond_6
    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    invoke-virtual {v8, v6}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    :goto_2
    const/4 v6, 0x2

    .line 108
    new-array v8, v6, [I

    .line 109
    invoke-virtual {v0, v8}, Landroid/view/View;->getLocationInWindow([I)V

    .line 110
    const-string v9, "shape"

    invoke-virtual {p1, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 111
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 112
    const-string v9, "width"

    invoke-virtual {p1, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    mul-float v10, v10, p5

    float-to-double v10, v10

    invoke-virtual {v9, v10, v11}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 113
    const-string v9, "height"

    invoke-virtual {p1, v9}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v9

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v10

    int-to-float v10, v10

    mul-float v10, v10, p5

    float-to-double v10, v10

    invoke-virtual {v9, v10, v11}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    const/4 v9, 0x0

    if-eqz v5, :cond_7

    .line 114
    invoke-virtual {v5}, Landroid/view/View;->getScrollX()I

    move-result v10

    goto :goto_3

    :cond_7
    move v10, v9

    :goto_3
    if-eqz v5, :cond_8

    .line 115
    invoke-virtual {v5}, Landroid/view/View;->getScrollY()I

    move-result v5

    goto :goto_4

    :cond_8
    move v5, v9

    .line 116
    :goto_4
    const-string v11, "x"

    invoke-virtual {p1, v11}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v11

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v12

    sub-int/2addr v12, v10

    int-to-float v10, v12

    mul-float v10, v10, p5

    float-to-double v12, v10

    invoke-virtual {v11, v12, v13}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 117
    const-string v10, "y"

    invoke-virtual {p1, v10}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v10

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v11

    sub-int/2addr v11, v5

    int-to-float v5, v11

    mul-float v5, v5, p5

    float-to-double v11, v5

    invoke-virtual {v10, v11, v12}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 118
    const-string v5, "left"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    aget v10, v8, v9

    int-to-float v10, v10

    mul-float v10, v10, p5

    float-to-double v10, v10

    invoke-virtual {v5, v10, v11}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 119
    const-string v5, "top"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    aget v8, v8, v7

    int-to-float v8, v8

    mul-float v8, v8, p5

    float-to-double v10, v8

    invoke-virtual {v5, v10, v11}, Landroid/util/JsonWriter;->value(D)Landroid/util/JsonWriter;

    .line 120
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 121
    const-string v5, "visibility"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    invoke-static {v0}, Lcom/tendcloud/tenddata/v;->b(Landroid/view/View;)Z

    move-result v8

    invoke-virtual {v5, v8}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 122
    const-string v5, "clickable"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    invoke-static {v0}, Lcom/tendcloud/tenddata/v;->f(Landroid/view/View;)Z

    move-result v8

    invoke-virtual {v5, v8}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 123
    const-string v5, "zIndex"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    const-wide/16 v10, 0x2710

    invoke-virtual {v5, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 124
    const-string v5, "href"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/util/JsonWriter;->value(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 125
    instance-of v4, v0, Landroid/view/ViewGroup;

    if-eqz v4, :cond_9

    .line 126
    move-object v5, v0

    check-cast v5, Landroid/view/ViewGroup;

    .line 127
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    if-lez v5, :cond_9

    move v5, v9

    goto :goto_5

    :cond_9
    move v5, v7

    .line 128
    :goto_5
    const-string v8, "isLeaf"

    invoke-virtual {p1, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v8

    invoke-virtual {v8, v5}, Landroid/util/JsonWriter;->value(Z)Landroid/util/JsonWriter;

    .line 129
    const-string v5, "native"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 130
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 131
    const-string v5, "listItem"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 132
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 133
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 134
    const-string v5, "row"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    move-result-object v5

    const-wide/16 v10, 0x0

    invoke-virtual {v5, v10, v11}, Landroid/util/JsonWriter;->value(J)Landroid/util/JsonWriter;

    .line 135
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 136
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 137
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 138
    instance-of v5, v0, Landroid/webkit/WebView;

    if-eqz v5, :cond_a

    .line 139
    move-object v5, v0

    check-cast v5, Landroid/webkit/WebView;

    .line 140
    new-array v6, v6, [I

    .line 141
    invoke-virtual {v5, v6}, Landroid/view/View;->getLocationInWindow([I)V

    .line 142
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "javascript:if(window.talkingdata&&window.talkingdata.getConfig){window.talkingdata.getConfig("

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v10

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, ", "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v11, v6, v9

    int-to-float v11, v11

    mul-float v11, v11, p5

    float-to-int v11, v11

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget v6, v6, v7

    int-to-float v6, v6

    mul-float v6, v6, p5

    float-to-int v6, v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, p5

    float-to-int v6, v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v6

    int-to-float v6, v6

    mul-float v6, v6, p5

    float-to-int v6, v6

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ");}"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 146
    iget-object v7, p0, Lcom/tendcloud/tenddata/s;->h:Landroid/os/Handler;

    new-instance v8, Lcom/tendcloud/tenddata/s$1;

    invoke-direct {v8, p0, v5, v6}, Lcom/tendcloud/tenddata/s$1;-><init>(Lcom/tendcloud/tenddata/s;Landroid/webkit/WebView;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 147
    :cond_a
    const-string v5, "children"

    invoke-virtual {p1, v5}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 148
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    if-eqz v4, :cond_c

    .line 149
    move-object v7, v0

    check-cast v7, Landroid/view/ViewGroup;

    .line 150
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    :goto_6
    if-ge v9, v8, :cond_c

    move-object v4, v3

    move-object v3, v2

    .line 151
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_b

    move-object v0, p0

    move-object v1, p1

    move/from16 v5, p5

    move-object/from16 v6, p6

    .line 152
    invoke-direct/range {v0 .. v6}, Lcom/tendcloud/tenddata/s;->a(Landroid/util/JsonWriter;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V

    :cond_b
    add-int/lit8 v9, v9, 0x1

    move-object v2, v3

    move-object v3, v4

    goto :goto_6

    .line 153
    :cond_c
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    .line 154
    invoke-virtual {p1}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    return-void
.end method

.method private a(Landroid/util/JsonWriter;Lcom/tendcloud/tenddata/s$e;)V
    .locals 7

    .line 79
    invoke-virtual {p1}, Landroid/util/JsonWriter;->beginArray()Landroid/util/JsonWriter;

    .line 80
    iget-object v2, p2, Lcom/tendcloud/tenddata/s$e;->rootView:Landroid/view/View;

    iget v5, p2, Lcom/tendcloud/tenddata/s$e;->scale:F

    iget-object v6, p2, Lcom/tendcloud/tenddata/s$e;->activityName:Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "0"

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/tendcloud/tenddata/s;->a(Landroid/util/JsonWriter;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;)V

    .line 81
    invoke-virtual {v1}, Landroid/util/JsonWriter;->endArray()Landroid/util/JsonWriter;

    return-void
.end method

.method public static synthetic b()Ljava/util/concurrent/CountDownLatch;
    .locals 1

    .line 1
    sget-object v0, Lcom/tendcloud/tenddata/s;->e:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Lcom/tendcloud/tenddata/g;Ljava/io/OutputStream;)V
    .locals 12

    .line 3
    iget-object v0, p0, Lcom/tendcloud/tenddata/s;->f:Lcom/tendcloud/tenddata/s$d;

    invoke-virtual {v0, p1}, Lcom/tendcloud/tenddata/s$d;->findInActivities(Lcom/tendcloud/tenddata/g;)V

    .line 4
    new-instance p1, Ljava/util/concurrent/FutureTask;

    iget-object v0, p0, Lcom/tendcloud/tenddata/s;->f:Lcom/tendcloud/tenddata/s$d;

    invoke-direct {p1, v0}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 5
    iget-object v0, p0, Lcom/tendcloud/tenddata/s;->h:Landroid/os/Handler;

    invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    new-instance v0, Ljava/io/OutputStreamWriter;

    invoke-direct {v0, p2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 7
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 8
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3

    invoke-virtual {p1, v3, v4, v2}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, p1

    .line 9
    :catch_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_0

    .line 11
    const-string p1, "\"\""

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 12
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->flush()V

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 13
    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tendcloud/tenddata/s$e;

    .line 14
    iget v2, v1, Lcom/tendcloud/tenddata/s$e;->scale:F

    .line 15
    new-instance v3, Landroid/util/JsonWriter;

    invoke-direct {v3, v0}, Landroid/util/JsonWriter;-><init>(Ljava/io/Writer;)V

    .line 16
    const-string v4, "{"

    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 17
    const-string v5, "\"page\":"

    invoke-virtual {v0, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 18
    iget-object v6, v1, Lcom/tendcloud/tenddata/s$e;->activityName:Ljava/lang/String;

    invoke-static {v6}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 19
    const-string v6, ","

    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 20
    const-string v7, "\"scale\":"

    invoke-virtual {v0, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 21
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v7, "%s"

    invoke-static {v7, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 23
    const-string v2, "\"app\":"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 24
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 25
    const-string v2, "\"platform\":\"android\""

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 26
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 27
    const-string v2, "\"app_version\":"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 28
    invoke-static {}, Lcom/tendcloud/tenddata/cb;->k()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 29
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 30
    const-string v2, "\"width\":"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 31
    iget-object v2, v1, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;

    invoke-static {v2}, Lcom/tendcloud/tenddata/s$a;->access$000(Lcom/tendcloud/tenddata/s$a;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 32
    iget-object v2, v1, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;

    invoke-static {v2}, Lcom/tendcloud/tenddata/s$a;->access$000(Lcom/tendcloud/tenddata/s$a;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    goto :goto_0

    :cond_1
    move v2, p1

    .line 33
    :goto_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 35
    const-string v2, "\"height\":"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 36
    iget-object v2, v1, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;

    invoke-static {v2}, Lcom/tendcloud/tenddata/s$a;->access$000(Lcom/tendcloud/tenddata/s$a;)Landroid/graphics/Bitmap;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 37
    iget-object v2, v1, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;

    invoke-static {v2}, Lcom/tendcloud/tenddata/s$a;->access$000(Lcom/tendcloud/tenddata/s$a;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    goto :goto_1

    :cond_2
    move v2, p1

    .line 38
    :goto_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 39
    const-string v2, "}"

    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 40
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 41
    const-string v8, "\"native\":"

    invoke-virtual {v0, v8}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 42
    invoke-virtual {v3}, Landroid/util/JsonWriter;->beginObject()Landroid/util/JsonWriter;

    .line 43
    const-string v8, "elements"

    invoke-virtual {v3, v8}, Landroid/util/JsonWriter;->name(Ljava/lang/String;)Landroid/util/JsonWriter;

    .line 44
    invoke-direct {p0, v3, v1}, Lcom/tendcloud/tenddata/s;->a(Landroid/util/JsonWriter;Lcom/tendcloud/tenddata/s$e;)V

    .line 45
    invoke-virtual {v3}, Landroid/util/JsonWriter;->endObject()Landroid/util/JsonWriter;

    .line 46
    invoke-virtual {v3}, Landroid/util/JsonWriter;->flush()V

    .line 47
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 48
    const-string v3, "\"hybrid\":"

    invoke-virtual {v0, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 50
    sget-object v3, Lcom/tendcloud/tenddata/s;->e:Ljava/util/concurrent/CountDownLatch;

    if-eqz v3, :cond_3

    .line 51
    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->await()V

    .line 52
    :cond_3
    sget-object v3, Lcom/tendcloud/tenddata/s;->d:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const-string v9, ""

    if-lez v4, :cond_4

    .line 53
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 54
    const-string v3, "page"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 55
    :try_start_2
    const-string v10, "webviewY"

    invoke-virtual {v4, v10}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 56
    invoke-virtual {v4, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_2
    move-object v11, v9

    move-object v9, v3

    move-object v3, v11

    goto :goto_4

    :catchall_0
    move-exception v4

    goto :goto_3

    :catchall_1
    move-exception v4

    move-object v3, v9

    .line 57
    :goto_3
    invoke-static {v4}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    move-object v3, v9

    .line 58
    :goto_4
    invoke-virtual {v0, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 59
    invoke-static {v9}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 60
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 61
    const-string v4, "\"webviewY\":"

    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v7, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 63
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 64
    const-string p1, "\"elements\":"

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 65
    invoke-static {v3}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 67
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 68
    const-string p1, "\"screenshot\":"

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->flush()V

    .line 70
    iget-object p1, v1, Lcom/tendcloud/tenddata/s$e;->screenshot:Lcom/tendcloud/tenddata/s$a;

    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v3, 0x3c

    .line 71
    invoke-virtual {p1, v1, v3, p2}, Lcom/tendcloud/tenddata/s$a;->writeBitmapJSON(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Ljava/lang/String;

    .line 72
    invoke-virtual {v0, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 73
    const-string p1, "\"image_hash\":"

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 74
    sget-object p1, Lcom/tendcloud/tenddata/s;->j:Ljava/lang/String;

    invoke-static {p1}, Lorg/json/JSONObject;->quote(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 75
    invoke-virtual {v0, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 76
    sget-object p1, Lcom/tendcloud/tenddata/s;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    const/4 p1, 0x0

    .line 77
    sput-object p1, Lcom/tendcloud/tenddata/s;->e:Ljava/util/concurrent/CountDownLatch;

    .line 78
    invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->flush()V

    return-void
.end method
