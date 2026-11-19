.class public Lg1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg1/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/DataSource;Z)Lg1/b;
    .locals 0

    .line 1
    sget-object p1, Lg1/a;->a:Lg1/a;

    .line 2
    .line 3
    return-object p1
.end method
