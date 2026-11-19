.class Lcom/umeng/commonsdk/internal/utils/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/internal/utils/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/umeng/commonsdk/internal/utils/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/internal/utils/b;

    .line 2
    .line 3
    invoke-static {}, Lcom/umeng/commonsdk/internal/utils/b;->d()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, Lcom/umeng/commonsdk/internal/utils/b;-><init>(Landroid/content/Context;Lcom/umeng/commonsdk/internal/utils/b$1;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/umeng/commonsdk/internal/utils/b$a;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lcom/umeng/commonsdk/internal/utils/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/internal/utils/b$a;->a:Lcom/umeng/commonsdk/internal/utils/b;

    .line 2
    .line 3
    return-object v0
.end method
