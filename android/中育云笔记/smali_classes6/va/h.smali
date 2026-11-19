.class public final synthetic Lva/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva/h;->c:Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lva/h;->c:Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;

    check-cast p1, Lcom/friday/common/entity/NoteBean;

    invoke-static {v0, p1}, Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;->A(Lcom/zykj/cloudhelper/fragment/StoreNoteFragment;Lcom/friday/common/entity/NoteBean;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
