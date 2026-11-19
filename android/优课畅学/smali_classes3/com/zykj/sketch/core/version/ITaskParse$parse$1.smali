.class final Lcom/zykj/sketch/core/version/ITaskParse$parse$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/sketch/core/version/ITaskParse$DefaultImpls;->parse$default(Lcom/zykj/sketch/core/version/ITaskParse;Ljava/util/List;Lcom/zykj/sketch/core/listener/EventListener;Lx7/l;ILjava/lang/Object;)Lcom/zykj/sketch/core/data/RenderTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/l;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/sketch/core/version/ITaskParse$parse$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/sketch/core/version/ITaskParse$parse$1;

    invoke-direct {v0}, Lcom/zykj/sketch/core/version/ITaskParse$parse$1;-><init>()V

    sput-object v0, Lcom/zykj/sketch/core/version/ITaskParse$parse$1;->INSTANCE:Lcom/zykj/sketch/core/version/ITaskParse$parse$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/zykj/sketch/core/listener/ViewControl;

    invoke-virtual {p0, p1}, Lcom/zykj/sketch/core/version/ITaskParse$parse$1;->invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V

    sget-object p1, Lh7/p;->a:Lh7/p;

    return-object p1
.end method

.method public final invoke(Lcom/zykj/sketch/core/listener/ViewControl;)V
    .locals 1

    .line 1
    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
