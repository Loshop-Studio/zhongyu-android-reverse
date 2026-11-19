.class public final synthetic Lc4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/NoteActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/NoteActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc4/a;->c:Lcom/friday/paint/view/NoteActivity;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lc4/a;->c:Lcom/friday/paint/view/NoteActivity;

    invoke-static {v0}, Lcom/friday/paint/view/NoteActivity;->N(Lcom/friday/paint/view/NoteActivity;)Landroidx/fragment/app/Fragment;

    move-result-object v0

    return-object v0
.end method
