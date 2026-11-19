.class public final synthetic Ld4/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/paint/view/six/NewStudentPaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/six/NewStudentPaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/w0;->c:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/w0;->c:Lcom/friday/paint/view/six/NewStudentPaintFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/friday/paint/view/six/NewStudentPaintFragment;->l0(Lcom/friday/paint/view/six/NewStudentPaintFragment;Ljava/lang/String;)V

    return-void
.end method
