.class final Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->createPage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ZLx7/a;ILjava/lang/Object;)Lcom/zykj/blackboard/core/edit/IPageControl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lx7/a;"
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;->INSTANCE:Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/IBoardControl$createPage$1;->invoke()V

    sget-object v0, Lh7/p;->a:Lh7/p;

    return-object v0
.end method

.method public final invoke()V
    .locals 0

    .line 1
    return-void
.end method
