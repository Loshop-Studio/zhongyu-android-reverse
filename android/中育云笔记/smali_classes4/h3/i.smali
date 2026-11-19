.class public final synthetic Lh3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh3/i;->c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh3/i;->c:Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;

    invoke-static {v0}, Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;->e(Lcom/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout;)V

    return-void
.end method
