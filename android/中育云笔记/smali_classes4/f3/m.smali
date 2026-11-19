.class public final synthetic Lf3/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

.field public final synthetic d:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/m;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    iput-object p2, p0, Lf3/m;->d:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf3/m;->c:Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;

    iget-object v1, p0, Lf3/m;->d:Landroid/widget/TextView;

    invoke-static {v0, v1, p1}, Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;->j(Lcom/friday/lecture/floatwindow/homework/HomeworkLayout;Landroid/widget/TextView;Landroid/view/View;)V

    return-void
.end method
