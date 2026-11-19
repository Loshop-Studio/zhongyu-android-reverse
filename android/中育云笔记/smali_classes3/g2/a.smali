.class public final Lg2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lg2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg2/a;

    .line 2
    .line 3
    invoke-direct {v0}, Lg2/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lg2/a;->a:Lg2/a;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    const-string v0, "com.zykj.manage"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/AppUtils;->isAppInstalled(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
