.class public final synthetic Lz2/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;


# direct methods
.method public synthetic constructor <init>(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lz2/z;->c:Z

    iput-object p2, p0, Lz2/z;->d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lz2/z;->c:Z

    iget-object v1, p0, Lz2/z;->d:Lcom/friday/document/viewmodel/ShareByTeacherViewModel;

    invoke-static {v0, v1}, Lcom/friday/document/viewmodel/ShareByTeacherViewModel;->e(ZLcom/friday/document/viewmodel/ShareByTeacherViewModel;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
