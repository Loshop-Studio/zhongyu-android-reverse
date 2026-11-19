.class public final synthetic Ld4/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lkb/y1;

.field public final synthetic d:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public synthetic constructor <init>(Lkb/y1;Lcom/friday/paint/view/six/NewPaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/q0;->c:Lkb/y1;

    iput-object p2, p0, Ld4/q0;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ld4/q0;->c:Lkb/y1;

    iget-object v1, p0, Ld4/q0;->d:Lcom/friday/paint/view/six/NewPaintFragment;

    invoke-static {v0, v1}, Lcom/friday/paint/view/six/NewPaintFragment;->B(Lkb/y1;Lcom/friday/paint/view/six/NewPaintFragment;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
