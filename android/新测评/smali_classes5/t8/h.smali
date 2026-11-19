.class public final synthetic Lt8/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic a:Lt8/j;


# direct methods
.method public synthetic constructor <init>(Lt8/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/h;->a:Lt8/j;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lt8/h;->a:Lt8/j;

    check-cast p1, Ljava/lang/Class;

    invoke-static {v0, p1}, Lt8/j;->e(Lt8/j;Ljava/lang/Class;)V

    return-void
.end method
