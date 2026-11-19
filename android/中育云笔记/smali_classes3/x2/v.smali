.class public final synthetic Lx2/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareTeacherFileFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareTeacherFileFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/v;->c:Lcom/friday/document/view/share/ShareTeacherFileFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lx2/v;->c:Lcom/friday/document/view/share/ShareTeacherFileFragment;

    invoke-static {v0}, Lcom/friday/document/view/share/ShareTeacherFileFragment;->X(Lcom/friday/document/view/share/ShareTeacherFileFragment;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    return-object v0
.end method
