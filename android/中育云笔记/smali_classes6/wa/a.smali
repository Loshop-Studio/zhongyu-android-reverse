.class public final synthetic Lwa/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

.field public final synthetic d:Lcom/friday/common/entity/NoteBean;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa/a;->c:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    iput-object p2, p0, Lwa/a;->d:Lcom/friday/common/entity/NoteBean;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lwa/a;->c:Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;

    iget-object v1, p0, Lwa/a;->d:Lcom/friday/common/entity/NoteBean;

    invoke-static {v0, v1}, Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;->e(Lcom/zykj/cloudhelper/viewmodel/PickNoteViewModel;Lcom/friday/common/entity/NoteBean;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
