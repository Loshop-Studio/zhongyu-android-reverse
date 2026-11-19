.class public interface abstract Lz/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/c$a$a;
    }
.end annotation


# static fields
.field public static final a:Lz/c$a$a;

.field public static final b:Lz/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lz/c$a$a;->a:Lz/c$a$a;

    .line 2
    .line 3
    sput-object v0, Lz/c$a;->a:Lz/c$a$a;

    .line 4
    .line 5
    new-instance v0, Lz/b$a;

    .line 6
    .line 7
    invoke-direct {v0}, Lz/b$a;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lz/c$a;->b:Lz/c$a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(Lz/d;Lw/k;)Lz/c;
.end method
