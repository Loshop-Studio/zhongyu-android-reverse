.class final Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/IBoardControl$DefaultImpls;->deletePage$default(Lcom/zykj/blackboard/core/edit/IBoardControl;ILr6/a;ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lr6/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ld6/s;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;

    invoke-direct {v0}, Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;-><init>()V

    sput-object v0, Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;->INSTANCE:Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;

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
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/IBoardControl$deletePage$1;->invoke()V

    sget-object v0, Ld6/s;->a:Ld6/s;

    return-object v0
.end method

.method public final invoke()V
    .locals 0

    .line 1
    return-void
.end method
