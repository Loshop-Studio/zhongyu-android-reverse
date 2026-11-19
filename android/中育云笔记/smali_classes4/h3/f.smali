.class public final synthetic Lh3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/Observer;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/f;->c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh3/f;->c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    check-cast p1, Ljava/util/List;

    invoke-static {v0, p1}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->d(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;Ljava/util/List;)V

    return-void
.end method
