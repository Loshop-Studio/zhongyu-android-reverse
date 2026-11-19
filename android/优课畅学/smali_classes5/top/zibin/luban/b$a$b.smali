.class public Ltop/zibin/luban/b$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lga/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltop/zibin/luban/b$a;->k(Ljava/lang/String;)Ltop/zibin/luban/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ltop/zibin/luban/b$a;


# direct methods
.method public constructor <init>(Ltop/zibin/luban/b$a;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/zibin/luban/b$a$b;->b:Ltop/zibin/luban/b$a;

    .line 2
    .line 3
    iput-object p2, p0, Ltop/zibin/luban/b$a$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public getPath()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ltop/zibin/luban/b$a$b;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public open()Ljava/io/InputStream;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/FileInputStream;

    .line 2
    .line 3
    iget-object v1, p0, Ltop/zibin/luban/b$a$b;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
