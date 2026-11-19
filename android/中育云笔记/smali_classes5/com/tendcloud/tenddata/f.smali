.class final Lcom/tendcloud/tenddata/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z

.field private static b:Z

.field private static c:Z

.field private static d:Z

.field private static e:Z

.field private static f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-class v0, Landroid/view/View;

    .line 2
    .line 3
    const-string v1, "getChildAdapterPosition"

    .line 4
    .line 5
    const-class v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    :try_start_0
    sget v5, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    .line 10
    .line 11
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v2, v1, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 16
    .line 17
    .line 18
    sput-boolean v4, Lcom/tendcloud/tenddata/f;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    sput-boolean v3, Lcom/tendcloud/tenddata/f;->a:Z

    .line 22
    .line 23
    :goto_0
    :try_start_1
    sget v5, Landroidx/recyclerview/widget/RecyclerView;->HORIZONTAL:I

    .line 24
    .line 25
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v2, v1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    sput-boolean v4, Lcom/tendcloud/tenddata/f;->b:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    sput-boolean v3, Lcom/tendcloud/tenddata/f;->b:Z

    .line 36
    .line 37
    :goto_1
    :try_start_2
    sget v0, Landroidx/fragment/app/Fragment;->c:I

    .line 38
    .line 39
    sput-boolean v4, Lcom/tendcloud/tenddata/f;->c:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :catchall_2
    sput-boolean v3, Lcom/tendcloud/tenddata/f;->c:Z

    .line 43
    .line 44
    :goto_2
    :try_start_3
    sget v0, Landroidx/fragment/app/Fragment;->c:I

    .line 45
    .line 46
    sput-boolean v4, Lcom/tendcloud/tenddata/f;->d:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :catchall_3
    sput-boolean v3, Lcom/tendcloud/tenddata/f;->d:Z

    .line 50
    .line 51
    :goto_3
    :try_start_4
    sget v0, Landroidx/viewpager/widget/ViewPager;->SCROLL_STATE_IDLE:I

    .line 52
    .line 53
    sput-boolean v4, Lcom/tendcloud/tenddata/f;->e:Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :catchall_4
    sput-boolean v3, Lcom/tendcloud/tenddata/f;->e:Z

    .line 57
    .line 58
    :goto_4
    :try_start_5
    sget v0, Landroidx/viewpager/widget/ViewPager;->SCROLL_STATE_IDLE:I

    .line 59
    .line 60
    sput-boolean v4, Lcom/tendcloud/tenddata/f;->f:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 61
    .line 62
    goto :goto_5

    .line 63
    :catchall_5
    sput-boolean v3, Lcom/tendcloud/tenddata/f;->f:Z

    .line 64
    .line 65
    :goto_5
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 5
    .line 6
    const-string v1, "CodelessClassExistUtils can\'t be instantiated!"

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    throw v0
.end method

.method public static a()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/f;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public static b()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/f;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public static c()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/f;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public static d()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/f;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public static e()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/f;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public static f()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/tenddata/f;->f:Z

    .line 2
    .line 3
    return v0
.end method
