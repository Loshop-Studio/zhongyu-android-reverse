.class public final synthetic Ll3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/view/LectureDialogFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/view/LectureDialogFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/c;->c:Lcom/friday/lecture/view/LectureDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/c;->c:Lcom/friday/lecture/view/LectureDialogFragment;

    check-cast p1, Lcom/friday/lecture/model/ConnectionStatus;

    invoke-static {v0, p1}, Lcom/friday/lecture/view/LectureDialogFragment;->w(Lcom/friday/lecture/view/LectureDialogFragment;Lcom/friday/lecture/model/ConnectionStatus;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
