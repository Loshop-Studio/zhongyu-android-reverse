.class public final synthetic Lc4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/StudentPaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/StudentPaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/f;->c:Lcom/friday/paint/view/StudentPaintFragment;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/f;->c:Lcom/friday/paint/view/StudentPaintFragment;

    invoke-static {v0}, Lcom/friday/paint/view/StudentPaintFragment;->m1(Lcom/friday/paint/view/StudentPaintFragment;)V

    return-void
.end method
