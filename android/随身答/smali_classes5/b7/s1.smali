.class public final synthetic Lb7/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/s1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb7/s1;->a:Lcom/zykj/view/board/board/BoardViewModel;

    check-cast p1, Ld5/k;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->n(Lcom/zykj/view/board/board/BoardViewModel;Ld5/k;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
