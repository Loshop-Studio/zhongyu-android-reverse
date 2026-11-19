.class public La/h/d/d$a;
.super La/h/g/m;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/h/d/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:La/h/c/b/h$a;


# direct methods
.method public constructor <init>(La/h/c/b/h$a;)V
    .locals 0

    invoke-direct {p0}, La/h/g/m;-><init>()V

    iput-object p1, p0, La/h/d/d$a;->a:La/h/c/b/h$a;

    return-void
.end method
