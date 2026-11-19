.class public final synthetic Lx2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareByTeacherFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/j;->c:Lcom/friday/document/view/share/ShareByTeacherFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/j;->c:Lcom/friday/document/view/share/ShareByTeacherFragment;

    check-cast p1, Lcom/friday/document/model/TchByCloudEntity;

    invoke-static {v0, p1}, Lcom/friday/document/view/share/ShareByTeacherFragment;->u(Lcom/friday/document/view/share/ShareByTeacherFragment;Lcom/friday/document/model/TchByCloudEntity;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
