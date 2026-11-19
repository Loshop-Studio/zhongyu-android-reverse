.class public final synthetic Ll3/d;
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

    iput-object p1, p0, Ll3/d;->c:Lcom/friday/lecture/view/LectureDialogFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Ll3/d;->c:Lcom/friday/lecture/view/LectureDialogFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-static {v0, p1}, Lcom/friday/lecture/view/LectureDialogFragment;->u(Lcom/friday/lecture/view/LectureDialogFragment;Z)Lqc/q;

    move-result-object p1

    return-object p1
.end method
