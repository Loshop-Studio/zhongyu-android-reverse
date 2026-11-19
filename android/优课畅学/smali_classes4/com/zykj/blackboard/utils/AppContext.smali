.class public final Lcom/zykj/blackboard/utils/AppContext;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/utils/AppContext;

.field private static context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/utils/AppContext;

    invoke-direct {v0}, Lcom/zykj/blackboard/utils/AppContext;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/utils/AppContext;->INSTANCE:Lcom/zykj/blackboard/utils/AppContext;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/blackboard/utils/AppContext;->context:Landroid/content/Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final init(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sput-object p1, Lcom/zykj/blackboard/utils/AppContext;->context:Landroid/content/Context;

    .line 11
    .line 12
    return-void
.end method
