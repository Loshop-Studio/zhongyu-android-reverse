.class public final synthetic Lb7/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/w1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/w1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0}, Lcom/zykj/view/board/board/BoardViewModel;->j(Lcom/zykj/view/board/board/BoardViewModel;)Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method
