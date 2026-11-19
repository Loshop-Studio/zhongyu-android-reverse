.class public final synthetic Lx2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lcom/friday/document/view/share/ShareByTeacherFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/document/view/share/ShareByTeacherFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx2/g;->c:Lcom/friday/document/view/share/ShareByTeacherFragment;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lx2/g;->c:Lcom/friday/document/view/share/ShareByTeacherFragment;

    invoke-static {v0}, Lcom/friday/document/view/share/ShareByTeacherFragment;->s(Lcom/friday/document/view/share/ShareByTeacherFragment;)Lcom/friday/document/adapter/TeacherListShareAdapter;

    move-result-object v0

    return-object v0
.end method
