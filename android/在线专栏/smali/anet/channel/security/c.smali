.class public Lanet/channel/security/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lanet/channel/security/ISecurityFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lanet/channel/security/ISecurityFactory;
    .locals 1

    .line 1
    sget-object v0, Lanet/channel/security/c;->a:Lanet/channel/security/ISecurityFactory;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lanet/channel/security/d;

    invoke-direct {v0}, Lanet/channel/security/d;-><init>()V

    sput-object v0, Lanet/channel/security/c;->a:Lanet/channel/security/ISecurityFactory;

    .line 3
    :cond_0
    sget-object v0, Lanet/channel/security/c;->a:Lanet/channel/security/ISecurityFactory;

    return-object v0
.end method
