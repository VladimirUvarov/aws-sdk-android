/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.securitytoken;

import com.amazonaws.*;
import com.amazonaws.regions.*;
import com.amazonaws.services.securitytoken.model.*;

/**
 * Interface for accessing AWS Security Token Service <fullname>AWS Security
 * Token Service</fullname>
 * <p>
 * The AWS Security Token Service (STS) is a web service that enables you to
 * request temporary, limited-privilege credentials for AWS Identity and Access
 * Management (IAM) users or for users that you authenticate (federated users).
 * This guide provides descriptions of the STS API. For more detailed
 * information about using this service, go to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html"
 * >Temporary Security Credentials</a>.
 * </p>
 * <note>
 * <p>
 * As an alternative to using the API, you can use one of the AWS SDKs, which
 * consist of libraries and sample code for various programming languages and
 * platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a
 * convenient way to create programmatic access to STS. For example, the SDKs
 * take care of cryptographically signing requests, managing errors, and
 * retrying requests automatically. For information about the AWS SDKs,
 * including how to download and install them, see the <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services page</a>.
 * </p>
 * </note>
 * <p>
 * For information about setting up signatures and authorization through the
 * API, go to <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
 * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
 * general information about the Query API, go to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
 * >Making Query Requests</a> in <i>Using IAM</i>. For information about using
 * security tokens with other AWS products, go to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
 * >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical documentation at
 * <a href="http://aws.amazon.com/documentation/">http://aws.amazon.com/
 * documentation/</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * The AWS Security Token Service (STS) has a default endpoint of
 * https://sts.amazonaws.com that maps to the US East (N. Virginia) region.
 * Additional regions are available and are activated by default. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
 * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * <p>
 * For information about STS endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"
 * >Regions and Endpoints</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls for
 * your AWS account and delivers log files to an Amazon S3 bucket. By using
 * information collected by CloudTrail, you can determine what requests were
 * successfully made to STS, who made the request, when it was made, and so on.
 * To learn more about CloudTrail, including how to turn it on and find your log
 * files, see the <a href=
 * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html"
 * >AWS CloudTrail User Guide</a>.
 * </p>
 **/
public interface AWSSecurityTokenService {

    /**
     * Overrides the default endpoint for this client
     * ("https://sts.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "sts.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://sts.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint The endpoint (ex: "sts.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://sts.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException If any problems are detected with the
     *             specified endpoint.
     */
    public void setEndpoint(String endpoint) throws java.lang.IllegalArgumentException;

    /**
     * An alternative to {@link AWSSecurityTokenService#setEndpoint(String)},
     * sets the regional endpoint for this client's service calls. Callers can
     * use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *            accessing a given region.
     * @throws java.lang.IllegalArgumentException If the given region is null,
     *             or if this service isn't available in the given region. See
     *             {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     */
    public void setRegion(Region region) throws java.lang.IllegalArgumentException;

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an access
     * key ID, a secret access key, and a security token) that you can use to
     * access AWS resources that you might not normally have access to.
     * Typically, you use <code>AssumeRole</code> for cross-account access or
     * federation. For a comparison of <code>AssumeRole</code> with the other
     * APIs that produce temporary credentials, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
     * >Requesting Temporary Security Credentials</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Important:</b> You cannot call <code>AssumeRole</code> by using AWS
     * root account credentials; access is denied. You must use credentials for
     * an IAM user or an IAM role to call <code>AssumeRole</code>.
     * </p>
     * <p>
     * For cross-account access, imagine that you own multiple accounts and need
     * to access resources in each account. You could create long-term
     * credentials in each account to access those resources. However, managing
     * all those credentials and remembering which one can access which account
     * can be time consuming. Instead, you can create one set of long-term
     * credentials in one account and then use temporary security credentials to
     * access all the other accounts by assuming roles in those accounts. For
     * more information about roles, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html">IAM
     * Roles (Delegation and Federation)</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For federation, you can, for example, grant single sign-on access to the
     * AWS Management Console. If you already have an identity and
     * authentication system in your corporate network, you don't have to
     * recreate user identities in AWS in order to grant those user identities
     * access to AWS. Instead, after a user has been authenticated, you call
     * <code>AssumeRole</code> (and specify the role with the appropriate
     * permissions) to get temporary security credentials for that user. With
     * those temporary security credentials, you construct a sign-in URL that
     * users can use to access the console. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html#sts-introduction"
     * >Common Scenarios for Temporary Credentials</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <p>
     * By default, the temporary security credentials created by
     * <code>AssumeRole</code> last for one hour. However, you can use the
     * optional <code>DurationSeconds</code> parameter to specify the duration
     * of your session. You can provide a value from 900 seconds (15 minutes) up
     * to the maximum session duration setting for the role. This setting can
     * have a value from 1 hour to 12 hours. To learn how to view the maximum
     * value for your role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>. The maximum session duration limit applies when you use
     * the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use
     * those operations to create a console URL. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">
     * Using IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by <code>AssumeRole</code> can
     * be used to make API calls to any AWS service with the following
     * exception: you cannot call the STS service's
     * <code>GetFederationToken</code> or <code>GetSessionToken</code> APIs.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If you
     * choose not to pass a policy, the temporary security credentials that are
     * returned by the operation have the permissions that are defined in the
     * access policy of the role that is being assumed. If you pass a policy to
     * this operation, the temporary security credentials that are returned by
     * the operation have the permissions that are allowed by both the access
     * policy of the role that is being assumed, <i> <b>and</b> </i> the policy
     * that you pass. This gives you a way to further restrict the permissions
     * for the resulting temporary security credentials. You cannot use the
     * passed policy to grant permissions that are in excess of those allowed by
     * the access policy of the role that is being assumed. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * To assume a role, your AWS account must be trusted by the role. The trust
     * relationship is defined in the role's trust policy when the role is
     * created. That trust policy states which accounts are allowed to delegate
     * access to this account's role.
     * </p>
     * <p>
     * The user who wants to access the role must also have permissions
     * delegated from the role's administrator. If the user is in a different
     * account than the role, then the user's administrator must attach a policy
     * that allows the user to call AssumeRole on the ARN of the role in the
     * other account. If the user is in the same account as the role, then you
     * can either attach a policy to the user (identical to the previous
     * different account user), or you can add the user as a principal directly
     * in the role's trust policy. In this case, the trust policy acts as the
     * only resource-based policy in IAM, and users in the same account as the
     * role do not need explicit permission to assume the role. For more
     * information about trust policies and resource-based policies, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html"
     * >IAM Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * <b>Using MFA with AssumeRole</b>
     * </p>
     * <p>
     * You can optionally include multi-factor authentication (MFA) information
     * when you call <code>AssumeRole</code>. This is useful for cross-account
     * scenarios in which you want to make sure that the user who is assuming
     * the role has been authenticated using an AWS MFA device. In that
     * scenario, the trust policy of the role being assumed includes a condition
     * that tests for MFA authentication; if the caller does not include valid
     * MFA information, the request to assume the role is denied. The condition
     * in a trust policy that tests for MFA authentication might look like the
     * following example.
     * </p>
     * <p>
     * <code>"Condition": {"Bool": {"aws:MultiFactorAuthPresent": true}}</code>
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/MFAProtectedAPI.html"
     * >Configuring MFA-Protected API Access</a> in the <i>IAM User Guide</i>
     * guide.
     * </p>
     * <p>
     * To use MFA with <code>AssumeRole</code>, you pass values for the
     * <code>SerialNumber</code> and <code>TokenCode</code> parameters. The
     * <code>SerialNumber</code> value identifies the user's hardware or virtual
     * MFA device. The <code>TokenCode</code> is the time-based one-time
     * password (TOTP) that the MFA devices produces.
     * </p>
     * 
     * @param assumeRoleRequest
     * @return assumeRoleResult The response from the AssumeRole service method,
     *         as returned by AWS Security Token Service.
     * @throws MalformedPolicyDocumentException
     * @throws PackedPolicyTooLargeException
     * @throws RegionDisabledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssumeRoleResult assumeRole(AssumeRoleRequest assumeRoleRequest) throws AmazonClientException,
            AmazonServiceException;

    /**
     * <p>
     * Returns a set of temporary security credentials for users who have been
     * authenticated in a mobile or web application with a web identity
     * provider, such as Amazon Cognito, Login with Amazon, Facebook, Google, or
     * any OpenID Connect-compatible identity provider.
     * </p>
     * <note>
     * <p>
     * For mobile applications, we recommend that you use Amazon Cognito. You
     * can use Amazon Cognito with the <a
     * href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS</a> and the <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android</a> to
     * uniquely identify a user and supply the user with a consistent identity
     * throughout the lifetime of an application.
     * </p>
     * <p>
     * To learn more about Amazon Cognito, see <a href=
     * "http://docs.aws.amazon.com/mobile/sdkforandroid/developerguide/cognito-auth.html#d0e840"
     * >Amazon Cognito Overview</a> in the <i>AWS SDK for Android Developer
     * Guide</i> guide and <a href=
     * "http://docs.aws.amazon.com/mobile/sdkforios/developerguide/cognito-auth.html#d0e664"
     * >Amazon Cognito Overview</a> in the <i>AWS SDK for iOS Developer
     * Guide</i>.
     * </p>
     * </note>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> does not require the use
     * of AWS security credentials. Therefore, you can distribute an application
     * (for example, on mobile devices) that requests temporary security
     * credentials without including long-term AWS credentials in the
     * application, and without deploying server-based proxy services that use
     * long-term AWS credentials. Instead, the identity of the caller is
     * validated by using a token from the web identity provider. For a
     * comparison of <code>AssumeRoleWithWebIdentity</code> with the other APIs
     * that produce temporary credentials, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
     * >Requesting Temporary Security Credentials</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials returned by this API consist of an
     * access key ID, a secret access key, and a security token. Applications
     * can use these temporary security credentials to sign calls to AWS service
     * APIs.
     * </p>
     * <p>
     * By default, the temporary security credentials created by
     * <code>AssumeRoleWithWebIdentity</code> last for one hour. However, you
     * can use the optional <code>DurationSeconds</code> parameter to specify
     * the duration of your session. You can provide a value from 900 seconds
     * (15 minutes) up to the maximum session duration setting for the role.
     * This setting can have a value from 1 hour to 12 hours. To learn how to
     * view the maximum value for your role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html#id_roles_use_view-role-max-session"
     * >View the Maximum Session Duration Setting for a Role</a> in the <i>IAM
     * User Guide</i>. The maximum session duration limit applies when you use
     * the <code>AssumeRole*</code> API operations or the
     * <code>assume-role*</code> CLI operations but does not apply when you use
     * those operations to create a console URL. For more information, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use.html">
     * Using IAM Roles</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials created by
     * <code>AssumeRoleWithWebIdentity</code> can be used to make API calls to
     * any AWS service with the following exception: you cannot call the STS
     * service's <code>GetFederationToken</code> or <code>GetSessionToken</code>
     * APIs.
     * </p>
     * <p>
     * Optionally, you can pass an IAM access policy to this operation. If you
     * choose not to pass a policy, the temporary security credentials that are
     * returned by the operation have the permissions that are defined in the
     * access policy of the role that is being assumed. If you pass a policy to
     * this operation, the temporary security credentials that are returned by
     * the operation have the permissions that are allowed by both the access
     * policy of the role that is being assumed, <i> <b>and</b> </i> the policy
     * that you pass. This gives you a way to further restrict the permissions
     * for the resulting temporary security credentials. You cannot use the
     * passed policy to grant permissions that are in excess of those allowed by
     * the access policy of the role that is being assumed. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * Before your application can call <code>AssumeRoleWithWebIdentity</code>,
     * you must have an identity token from a supported identity provider and
     * create a role that the application can assume. The role that your
     * application assumes must trust the identity provider that is associated
     * with the identity token. In other words, the identity provider must be
     * specified in the role's trust policy.
     * </p>
     * <important>
     * <p>
     * Calling <code>AssumeRoleWithWebIdentity</code> can result in an entry in
     * your AWS CloudTrail logs. The entry includes the <a
     * href="http://openid.net/specs/openid-connect-core-1_0.html#Claims"
     * >Subject</a> of the provided Web Identity Token. We recommend that you
     * avoid using any personally identifiable information (PII) in this field.
     * For example, you could instead use a GUID or a pairwise identifier, as <a
     * href
     * ="http://openid.net/specs/openid-connect-core-1_0.html#SubjectIDTypes"
     * >suggested in the OIDC specification</a>.
     * </p>
     * </important>
     * <p>
     * For more information about how to use web identity federation and the
     * <code>AssumeRoleWithWebIdentity</code> API, see the following resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc_manual.html"
     * >Using Web Identity Federation APIs for Mobile Apps</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://web-identity-federation-playground.s3.amazonaws.com/index.html">
     * Web Identity Federation Playground</a>. This interactive website lets you
     * walk through the process of authenticating via Login with Amazon,
     * Facebook, or Google, getting temporary security credentials, and then
     * using those credentials to make a request to AWS.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="http://aws.amazon.com/sdkforios/">AWS SDK for iOS</a> and <a
     * href="http://aws.amazon.com/sdkforandroid/">AWS SDK for Android</a>.
     * These toolkits contain sample apps that show how to invoke the identity
     * providers, and then how to use the information from these providers to
     * get and use temporary security credentials.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "http://aws.amazon.com/articles/web-identity-federation-with-mobile-applications"
     * >Web Identity Federation with Mobile Applications</a>. This article
     * discusses web identity federation and shows an example of how to use web
     * identity federation to get access to content in Amazon S3.
     * </p>
     * </li>
     * </ul>
     * 
     * @param assumeRoleWithWebIdentityRequest
     * @return assumeRoleWithWebIdentityResult The response from the
     *         AssumeRoleWithWebIdentity service method, as returned by AWS
     *         Security Token Service.
     * @throws MalformedPolicyDocumentException
     * @throws PackedPolicyTooLargeException
     * @throws IDPRejectedClaimException
     * @throws IDPCommunicationErrorException
     * @throws InvalidIdentityTokenException
     * @throws ExpiredTokenException
     * @throws RegionDisabledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(
            AssumeRoleWithWebIdentityRequest assumeRoleWithWebIdentityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns details about the IAM identity whose credentials are used to call
     * the API.
     * </p>
     * 
     * @param getCallerIdentityRequest
     * @return getCallerIdentityResult The response from the GetCallerIdentity
     *         service method, as returned by AWS Security Token Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCallerIdentityResult getCallerIdentity(GetCallerIdentityRequest getCallerIdentityRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a set of temporary security credentials (consisting of an access
     * key ID, a secret access key, and a security token) for a federated user.
     * A typical use is in a proxy application that gets temporary security
     * credentials on behalf of distributed applications inside a corporate
     * network. Because you must call the <code>GetFederationToken</code> action
     * using the long-term security credentials of an IAM user, this call is
     * appropriate in contexts where those credentials can be safely stored,
     * usually in a server-based application. For a comparison of
     * <code>GetFederationToken</code> with the other APIs that produce
     * temporary credentials, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
     * >Requesting Temporary Security Credentials</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>
     * <p>
     * If you are creating a mobile-based or browser-based app that can
     * authenticate users using a web identity provider like Login with Amazon,
     * Facebook, Google, or an OpenID Connect-compatible identity provider, we
     * recommend that you use <a href="http://aws.amazon.com/cognito/">Amazon
     * Cognito</a> or <code>AssumeRoleWithWebIdentity</code>. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_assumerolewithwebidentity"
     * >Federation Through a Web-based Identity Provider</a>.
     * </p>
     * </note>
     * <p>
     * The <code>GetFederationToken</code> action must be called by using the
     * long-term AWS security credentials of an IAM user. You can also call
     * <code>GetFederationToken</code> using the security credentials of an AWS
     * root account, but we do not recommended it. Instead, we recommend that
     * you create an IAM user for the purpose of the proxy application and then
     * attach a policy to the IAM user that limits federated users to only the
     * actions and resources that they need access to. For more information, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html">IAM
     * Best Practices</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The temporary security credentials that are obtained by using the
     * long-term credentials of an IAM user are valid for the specified
     * duration, from 900 seconds (15 minutes) up to a maximium of 129600
     * seconds (36 hours). The default is 43200 seconds (12 hours). Temporary
     * credentials that are obtained by using AWS root account credentials have
     * a maximum duration of 3600 seconds (1 hour).
     * </p>
     * <p>
     * The temporary security credentials created by
     * <code>GetFederationToken</code> can be used to make API calls to any AWS
     * service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot use these credentials to call any IAM APIs.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS APIs except <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Permissions</b>
     * </p>
     * <p>
     * The permissions for the temporary security credentials returned by
     * <code>GetFederationToken</code> are determined by a combination of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The policy or policies that are attached to the IAM user whose
     * credentials are used to call <code>GetFederationToken</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * The policy that is passed as a parameter in the call.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The passed policy is attached to the temporary security credentials that
     * result from the <code>GetFederationToken</code> API call--that is, to the
     * <i>federated user</i>. When the federated user makes an AWS request, AWS
     * evaluates the policy attached to the federated user in combination with
     * the policy or policies attached to the IAM user whose credentials were
     * used to call <code>GetFederationToken</code>. AWS allows the federated
     * user's request only when both the federated user <i> <b>and</b> </i> the
     * IAM user are explicitly allowed to perform the requested action. The
     * passed policy cannot grant more permissions than those that are defined
     * in the IAM user policy.
     * </p>
     * <p>
     * A typical use case is that the permissions of the IAM user whose
     * credentials are used to call <code>GetFederationToken</code> are designed
     * to allow access to all the actions and resources that any federated user
     * will need. Then, for individual users, you pass a policy to the operation
     * that scopes down the permissions to a level that's appropriate to that
     * individual user, using a policy that allows only a subset of permissions
     * that are granted to the IAM user.
     * </p>
     * <p>
     * If you do not pass a policy, the resulting temporary security credentials
     * have no effective permissions. The only exception is when the temporary
     * security credentials are used to access a resource that has a
     * resource-based policy that specifically allows the federated user to
     * access the resource.
     * </p>
     * <p>
     * For more information about how permissions work, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_getfederationtoken.html"
     * >Permissions for GetFederationToken</a>. For information about using
     * <code>GetFederationToken</code> to create temporary security credentials,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getfederationtoken"
     * >GetFederationToken—Federation Through a Custom Identity Broker</a>.
     * </p>
     * 
     * @param getFederationTokenRequest
     * @return getFederationTokenResult The response from the GetFederationToken
     *         service method, as returned by AWS Security Token Service.
     * @throws MalformedPolicyDocumentException
     * @throws PackedPolicyTooLargeException
     * @throws RegionDisabledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetFederationTokenResult getFederationToken(GetFederationTokenRequest getFederationTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM user.
     * The credentials consist of an access key ID, a secret access key, and a
     * security token. Typically, you use <code>GetSessionToken</code> if you
     * want to use MFA to protect programmatic calls to specific AWS APIs like
     * Amazon EC2 <code>StopInstances</code>. MFA-enabled IAM users would need
     * to call <code>GetSessionToken</code> and submit an MFA code that is
     * associated with their MFA device. Using the temporary security
     * credentials that are returned from the call, IAM users can then make
     * programmatic calls to APIs that require MFA authentication. If you do not
     * supply a correct MFA code, then the API returns an access denied error.
     * For a comparison of <code>GetSessionToken</code> with the other APIs that
     * produce temporary credentials, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
     * >Requesting Temporary Security Credentials</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the duration that
     * you specify, from 900 seconds (15 minutes) up to a maximum of 129600
     * seconds (36 hours), with a default of 43200 seconds (12 hours);
     * credentials that are created by using account credentials can range from
     * 900 seconds (15 minutes) up to a maximum of 3600 seconds (1 hour), with a
     * default of 1 hour.
     * </p>
     * <p>
     * The temporary security credentials created by
     * <code>GetSessionToken</code> can be used to make API calls to any AWS
     * service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot call any IAM APIs unless MFA authentication information is
     * included in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS API <i>except</i> <code>AssumeRole</code> or
     * <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We recommend that you do not call <code>GetSessionToken</code> with root
     * account credentials. Instead, follow our <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users"
     * >best practices</a> by creating one or more IAM users, giving them the
     * necessary permissions, and using IAM users for everyday interaction with
     * AWS.
     * </p>
     * </note>
     * <p>
     * The permissions associated with the temporary security credentials
     * returned by <code>GetSessionToken</code> are based on the permissions
     * associated with account or IAM user whose credentials are used to call
     * the action. If <code>GetSessionToken</code> is called using root account
     * credentials, the temporary credentials have root account permissions.
     * Similarly, if <code>GetSessionToken</code> is called using the
     * credentials of an IAM user, the temporary credentials have the same
     * permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to create
     * temporary credentials, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"
     * >Temporary Credentials for Users in Untrusted Environments</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getSessionTokenRequest
     * @return getSessionTokenResult The response from the GetSessionToken
     *         service method, as returned by AWS Security Token Service.
     * @throws RegionDisabledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSessionTokenResult getSessionToken(GetSessionTokenRequest getSessionTokenRequest)
            throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns a set of temporary credentials for an AWS account or IAM user.
     * The credentials consist of an access key ID, a secret access key, and a
     * security token. Typically, you use <code>GetSessionToken</code> if you
     * want to use MFA to protect programmatic calls to specific AWS APIs like
     * Amazon EC2 <code>StopInstances</code>. MFA-enabled IAM users would need
     * to call <code>GetSessionToken</code> and submit an MFA code that is
     * associated with their MFA device. Using the temporary security
     * credentials that are returned from the call, IAM users can then make
     * programmatic calls to APIs that require MFA authentication. If you do not
     * supply a correct MFA code, then the API returns an access denied error.
     * For a comparison of <code>GetSessionToken</code> with the other APIs that
     * produce temporary credentials, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html"
     * >Requesting Temporary Security Credentials</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#stsapi_comparison"
     * >Comparing the AWS STS APIs</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * The <code>GetSessionToken</code> action must be called by using the
     * long-term AWS security credentials of the AWS account or an IAM user.
     * Credentials that are created by IAM users are valid for the duration that
     * you specify, from 900 seconds (15 minutes) up to a maximum of 129600
     * seconds (36 hours), with a default of 43200 seconds (12 hours);
     * credentials that are created by using account credentials can range from
     * 900 seconds (15 minutes) up to a maximum of 3600 seconds (1 hour), with a
     * default of 1 hour.
     * </p>
     * <p>
     * The temporary security credentials created by
     * <code>GetSessionToken</code> can be used to make API calls to any AWS
     * service with the following exceptions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot call any IAM APIs unless MFA authentication information is
     * included in the request.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot call any STS API <i>except</i> <code>AssumeRole</code> or
     * <code>GetCallerIdentity</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * We recommend that you do not call <code>GetSessionToken</code> with root
     * account credentials. Instead, follow our <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#create-iam-users"
     * >best practices</a> by creating one or more IAM users, giving them the
     * necessary permissions, and using IAM users for everyday interaction with
     * AWS.
     * </p>
     * </note>
     * <p>
     * The permissions associated with the temporary security credentials
     * returned by <code>GetSessionToken</code> are based on the permissions
     * associated with account or IAM user whose credentials are used to call
     * the action. If <code>GetSessionToken</code> is called using root account
     * credentials, the temporary credentials have root account permissions.
     * Similarly, if <code>GetSessionToken</code> is called using the
     * credentials of an IAM user, the temporary credentials have the same
     * permissions as the IAM user.
     * </p>
     * <p>
     * For more information about using <code>GetSessionToken</code> to create
     * temporary credentials, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_request.html#api_getsessiontoken"
     * >Temporary Credentials for Users in Untrusted Environments</a> in the
     * <i>IAM User Guide</i>.
     * </p>
     * 
     * @return getSessionTokenResult The response from the GetSessionToken
     *         service method, as returned by AWS Security Token Service.
     * @throws RegionDisabledException
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetSessionTokenResult getSessionToken() throws AmazonClientException, AmazonServiceException;

    /**
     * <p>
     * Returns details about the IAM identity whose credentials are used to call
     * the API.
     * </p>
     * 
     * @return getCallerIdentityResult The response from the GetCallerIdentity
     *         service method, as returned by AWS Security Token Service.
     * @throws AmazonClientException If any internal errors are encountered
     *             inside the client while attempting to make the request or
     *             handle the response. For example if a network connection is
     *             not available.
     * @throws AmazonServiceException If an error response is returned by AWS
     *             Security Token Service indicating either a problem with the
     *             data in the request, or a server side issue.
     */
    GetCallerIdentityResult getCallerIdentity() throws AmazonClientException,
            AmazonServiceException;

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request The originally executed request.
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
