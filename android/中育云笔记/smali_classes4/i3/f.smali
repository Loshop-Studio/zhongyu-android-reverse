.class public final synthetic Li3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li3/f;->c:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li3/f;->c:Landroid/view/View;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/viewanswer/ViewAnswerObjectiveLayout;->m(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method
