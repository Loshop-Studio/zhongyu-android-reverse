.class public Lcom/alibaba/sdk/android/tbrest/rest/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/sdk/android/tbrest/rest/c$a;,
        Lcom/alibaba/sdk/android/tbrest/rest/c$b;
    }
.end annotation


# static fields
.field private static a:Lcom/alibaba/sdk/android/tbrest/rest/c;


# instance fields
.field private a:Lcom/alibaba/sdk/android/tbrest/rest/c$a;

.field private a:Lcom/alibaba/sdk/android/tbrest/rest/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/rest/c$b;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/alibaba/sdk/android/tbrest/rest/c$b;-><init>(Lcom/alibaba/sdk/android/tbrest/rest/c;Lcom/alibaba/sdk/android/tbrest/rest/c$1;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c$b;

    .line 11
    .line 12
    new-instance v0, Lcom/alibaba/sdk/android/tbrest/rest/c$a;

    .line 13
    .line 14
    invoke-direct {v0, p0, v1}, Lcom/alibaba/sdk/android/tbrest/rest/c$a;-><init>(Lcom/alibaba/sdk/android/tbrest/rest/c;Lcom/alibaba/sdk/android/tbrest/rest/c$1;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c$a;

    .line 18
    .line 19
    return-void
.end method

.method public static declared-synchronized a()Lcom/alibaba/sdk/android/tbrest/rest/c;
    .locals 2

    const-class v0, Lcom/alibaba/sdk/android/tbrest/rest/c;

    monitor-enter v0

    .line 1
    :try_start_0
    sget-object v1, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c;

    if-nez v1, :cond_0

    .line 2
    new-instance v1, Lcom/alibaba/sdk/android/tbrest/rest/c;

    invoke-direct {v1}, Lcom/alibaba/sdk/android/tbrest/rest/c;-><init>()V

    sput-object v1, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 3
    :cond_0
    :goto_0
    sget-object v1, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method


# virtual methods
.method public a([Ljava/lang/String;Z)[Ljava/lang/String;
    .locals 1

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p0, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c$a;

    goto :goto_0

    .line 5
    :cond_0
    iget-object p2, p0, Lcom/alibaba/sdk/android/tbrest/rest/c;->a:Lcom/alibaba/sdk/android/tbrest/rest/c$b;

    :goto_0
    if-eqz p2, :cond_1

    if-eqz p1, :cond_1

    .line 6
    array-length v0, p1

    if-lez v0, :cond_1

    .line 7
    invoke-static {p1, p2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
