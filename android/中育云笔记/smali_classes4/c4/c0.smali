.class public final synthetic Lc4/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/ThePaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/ThePaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/c0;->c:Lcom/friday/paint/view/ThePaintFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/c0;->c:Lcom/friday/paint/view/ThePaintFragment;

    invoke-static {v0}, Lcom/friday/paint/view/ThePaintFragment;->W(Lcom/friday/paint/view/ThePaintFragment;)Lcom/friday/paint/adapter/NoteFragmentStateAdapter;

    move-result-object v0

    return-object v0
.end method
