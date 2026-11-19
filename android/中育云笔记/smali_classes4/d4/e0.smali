.class public final synthetic Ld4/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/e0;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/e0;->c:Lcom/friday/paint/view/six/NewPaintFragment;

    check-cast p1, Lkotlin/Pair;

    invoke-static {v0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->T(Lcom/friday/paint/view/six/NewPaintFragment;Lkotlin/Pair;)V

    return-void
.end method
