package com.example.OrganizationApp.constants;

public class PermissionConstant {

    // Group permissions
    public static final String CREATE_GROUP = "C_GRP";
    public static final String UPDATE_GROUP = "U_GRP";
    public static final String DELETE_GROUP = "D_GRP";
    public static final String FIND_ALL_GROUP = "F_ALL_GRP";
    public static final String FIND_GROUP_BY_ID = "F_GROUP_BY_ID";
    public static final String FIND_GROUP_BY_CRITERIA = "F_GROUP_BY_CRIT";

    // Chain permissions
    public static final String CREATE_CHAIN = "C_CHAIN";
    public static final String UPDATE_CHAIN = "U_CHAIN";
    public static final String DELETE_CHAIN = "D_CHAIN";
    public static final String FIND_ALL_CHAIN = "F_ALL_CHAIN";
    public static final String FIND_CHAIN_BY_ID = "F_CHAIN_BY_ID";
    public static final String FIND_CHAIN_BY_CRITERIA = "F_CHAIN_BY_CRIT";

    // Business permissions
    public static final String CREATE_BUSINESS = "C_BUS";
    public static final String UPDATE_BUSINESS = "U_BUS";
    public static final String DELETE_BUSINESS = "D_BUS";
    public static final String FIND_ALL_BUSINESS = "F_ALL_BUS";
    public static final String FIND_BUSINESS_BY_ID = "F_BUS_BY_ID";
    public static final String FIND_BUSINESS_BY_CRITERIA = "F_BUS_BY_CRIT";
    public static final String FIND_SETTLEMENT_CURR_BY_TERMINAL = "F_SETTL_CURR_BY_TERMINAL";
    public static final String FIND_BUSINESS_BY_TERMINAL = "F_BUS_BY_TERMINAL";


    // Outlet permissions
    public static final String CREATE_OUTLET = "C_OUTLET";
    public static final String UPDATE_OUTLET = "U_OUTLET";
    public static final String DELETE_OUTLET = "D_OUTLET";
    public static final String FIND_ALL_OUTLET = "F_ALL_OUTLET";
    public static final String FIND_OUTLET_BY_ID = "F_OUTLET_BY_ID";
    public static final String FIND_OUTLET_BY_CRITERIA = "F_OUTLET_BY_CRIT";
    public static final String FIND_OUTLET_BY_CODE = "F_OUTLET_BY_CODE";

    // Terminal permissions
    public static final String CREATE_TERMINAL = "C_TERM";
    public static final String UPDATE_TERMINAL = "U_TERM";
    public static final String DELETE_TERMINAL = "D_TERM";
    public static final String FIND_ALL_TERMINAL = "F_ALL_TERM";
    public static final String FIND_TERMINAL_BY_ID = "F_TERM_BY_ID";
    public static final String FIND_TERMINAL_BY_CRITERIA = "F_TERM_BY_CRIT";
    public static final String FIND_TERMINAL_BY_CODE = "F_TERM_BY_CODE";
    public static final String FIND_MIRROR_ID_BY_TERMINAL_BY_CODE = "F_MIRROR_ID_BY_TERM_AND_CODE";
    public static final String FIND_TERMINALS_BY_FI_ID = "F_TERS_BY_FI_ID";
    public static final String FIND_TERMINALS_For_Fees_Process_Execution = "F_TERMS_FOR_FEES_EXEC";
    public static final String FIND_TERMINAL_INFO_BY_CODE = "F_TERM_INFO_BY_CODE";


    // Wallet permissions
    public static final String CREATE_WALLET = "C_WALLET";
    public static final String UPDATE_WALLET = "U_WALLET";
    public static final String DELETE_WALLET = "D_WALLET";
    public static final String FIND_ALL_WALLET = "F_ALL_WALLET";
    public static final String FIND_WALLET_BY_ID = "F_WALLET_BY_ID";
    public static final String FIND_WALLET_BY_CRITERIA = "F_WALLET_BY_CRIT";

    // Wallet-Entry permissions
    public static final String CREATE_WALLET_ENTRY = "C_WALLET_ENTRY";
    public static final String UPDATE_WALLET_ENTRY = "U_WALLET_ENTRY";
    public static final String DELETE_WALLET_ENTRY = "D_WALLET_ENTRY";
    public static final String FIND_ALL_WALLET_ENTRY = "F_ALL_WALLET_ENTRY";
    public static final String FIND_WALLET_ENTRY_BY_ID = "F_WALLET_ENTRY_BY_ID";
    public static final String FIND_WALLET_ENTRY_BY_CRITERIA = "F_WALLET_ENTRY_BY_CRIT";

    // Wallet-Type permissions
    public static final String CREATE_WALLET_TYPE = "C_WALLET_TYPE";
    public static final String UPDATE_WALLET_TYPE = "U_WALLET_TYPE";
    public static final String DELETE_WALLET_TYPE = "D_WALLET_TYPE";
    public static final String FIND_ALL_WALLET_TYPE = "F_ALL_WALLET_TYPE";
    public static final String FIND_WALLET_TYPE_BY_ID = "F_WALLET_TYPE_BY_ID";
    public static final String FIND_WALLET_TYPE_BY_CRITERIA = "F_WALLET_TYPE_BY_CRIT";

    // Fi-Wallet-Type permissions
    public static final String CREATE_FI_WALLET_TYPE = "C_FI_WALLET_TYPE";
    public static final String UPDATE_FI_WALLET_TYPE = "U_FI_WALLET_TYPE";
    public static final String DELETE_FI_WALLET_TYPE = "D_FI_WALLET_TYPE";
    public static final String FIND_ALL_FI_WALLET_TYPE = "F_ALL_FI_WALLET_TYPE";
    public static final String FIND_FI_WALLET_TYPE_BY_ID = "F_FI_WALLET_TYPE_BY_ID";
    public static final String FIND_FI_WALLET_TYPE_BY_CRITERIA = "F_FI_WALLET_TYPE_BY_CRIT";

    // Fi-Device-Type permissions
    public static final String CREATE_FI_DEVICE_TYPE = "C_FI_DEVICE_TYPE";
    public static final String UPDATE_FI_DEVICE_TYPE = "U_FI_DEVICE_TYPE";
    public static final String DELETE_FI_DEVICE_TYPE = "D_FI_DEVICE_TYPE";
    public static final String FIND_ALL_FI_DEVICE_TYPE = "F_ALL_FI_DEVICE_TYPE";
    public static final String FIND_FI_DEVICE_TYPE_BY_ID = "F_FI_DEVICE_TYPE_BY_ID";
    public static final String FIND_FI_DEVICE_TYPE_BY_CRITERIA = "F_FI_DEVICE_TYPE_BY_CRIT";

    // Payout permissions
    public static final String CREATE_PAYOUT = "C_PAYOUT";
    public static final String UPDATE_PAYOUT = "U_PAYOUT";
    public static final String DELETE_PAYOUT = "D_PAYOUT";
    public static final String FIND_ALL_PAYOUT = "F_ALL_PAYOUT";
    public static final String FIND_PAYOUT_BY_ID = "F_PAYOUT_BY_ID";
    public static final String FIND_PAYOUT_BY_CRITERIA = "F_PAYOUT_BY_CRIT";

    // Payout-Frequencies permissions
    public static final String CREATE_PAYOUT_FREQUENCIES = "C_PAYOUT_FREQS";
    public static final String UPDATE_PAYOUT_FREQUENCIES = "U_PAYOUT_FREQS";
    public static final String DELETE_PAYOUT_FREQUENCIES = "D_PAYOUT_FREQS";
    public static final String FIND_ALL_PAYOUT_FREQUENCIES = "F_ALL_PAYOUT_FREQS";
    public static final String FIND_PAYOUT_FREQUENCIES_BY_ID = "F_PAYOUT_FREQS_BY_ID";
    public static final String FIND_PAYOUT_FREQUENCIES_BY_CRITERIA = "F_PAYOUT_FREQS_BY_CRIT";

    // Payout-Details permissions
    public static final String CREATE_PAYOUT_DETAILS = "C_PAYOUT_DETS";
    public static final String UPDATE_PAYOUT_DETAILS = "U_PAYOUT_DETS";
    public static final String DELETE_PAYOUT_DETAILS = "D_PAYOUT_DETS";
    public static final String FIND_ALL_PAYOUT_DETAILS = "F_ALL_PAYOUT_DETS";
    public static final String FIND_PAYOUT_DETAILS_BY_ID = "F_PAYOUT_DETS_BY_ID";
    public static final String FIND_PAYOUT_DETAILS_BY_CRITERIA = "F_PAYOUT_DETS_BY_CRIT";

    // Profile permissions
    public static final String CREATE_PROFILE = "C_PROF";
    public static final String UPDATE_PROFILE = "U_PROF";
    public static final String DELETE_PROFILE = "D_PROF";
    public static final String FIND_ALL_PROFILE = "F_ALL_PROF";
    public static final String FIND_PROFILE_BY_ID = "F_PROF_BY_ID";
    public static final String FIND_PROFILE_BY_CRITERIA = "F_PROF_BY_CRIT";
    public static final String GET_PROFILE_BY_OBJECT_ID = "F_PROF_BY_OBJ_ID";
    public static final String FIND_TRANSACTION_TYPES_BY_PROFILE_ID = "F_TRANS_TYPE_BY_PROF_ID";


    // Fi-Level permissions
    public static final String CREATE_FI_LEVEL = "C_FI_LEVEL";
    public static final String UPDATE_FI_LEVEL = "U_FI_LEVEL";
    public static final String DELETE_FI_LEVEL = "D_FI_LEVEL";
    public static final String FIND_ALL_FI_LEVEL = "F_ALL_FI_LEVEL";
    public static final String FIND_FI_LEVEL_BY_ID = "F_FI_LEVEL_BY_ID";
    public static final String FIND_FI_LEVEL_BY_CRITERIA = "F_FI_LEVEL_BY_CRIT";

    // Mdr-Profile permissions
    public static final String CREATE_MDR_PROFILE = "C_MDR_PROF";
    public static final String UPDATE_MDR_PROFILE = "U_MDR_PROF";
    public static final String DELETE_MDR_PROFILE = "D_MDR_PROF";
    public static final String FIND_ALL_MDR_PROFILE = "F_ALL_MDR_PROF";
    public static final String FIND_MDR_PROFILE_BY_ID = "F_MDR_PROF_BY_ID";
    public static final String FIND_MDR_PROFILE_BY_CRITERIA = "F_MDR_PROF_BY_CRIT";
    public static final String FIND_MDR_PROFILES_DETAILS = "F_MDR_PROF_DETAILS";


    // Endpoint-mirror-id permissions
    public static final String FIND_ALL_ENDPOINT_MIRROR_IDS = "F_ALL_ENDPNT_MIRR_IDS";
    public static final String FIND_ENDPOINT_MIRROR_IDS_BY_CRITERIA = "F_ENDPNT_MIRR_IDS_BY_CRIT";
    public static final String FIND_ENDPOINT_MIRROR_ID_BY_ID = "F_ENDPNT_MIRR_ID_BY_ID";
    public static final String CREATE_ENDPOINT_MIRROR_ID = "C_ENDPNT_MIRR_ID";
    public static final String UPDATE_ENDPOINT_MIRROR_ID = "U_ENDPNT_MIRR_ID";
    public static final String DELETE_ENDPOINT_MIRROR_ID = "D_ENDPNT_MIRR_ID";
    public static final String PROCESS_CSV_FILE = "P_CSV_FILE";

    //Validation File Permissions
    public static final String FIND_ALL_VALIDATION_FILE = "F_ALL_VALID_FILE";
    public static final String FIND_VALIDATION_FILE_BY_CRITERIA = "F_VALID_FILE_BY_CRIT";
    public static final String FIND_VALIDATION_FILE_BY_ID = "F_VALID_FILE_BY_ID";
    public static final String CREATE_VALIDATION_FILE = "C_VALID_FILE";
    public static final String UPDATE_VALIDATION_FILE = "U_VALID_FILE";
    public static final String DELETE_VALIDATION_FILE = "D_VALID_FILE";

    // Custom enums permissions
    public static final String GET_ALL_ENUMS_VALUES = "F_ALL_ENUMS_VALS";
    public static final String GET_ENUMS_VALUES_BY_NAME = "F_ENUMS_VALS_BY_NAME";

    public static final String FIND_OUTLET_BY_MERCHANT_ID = "F_OUTLET_BY_MERCH_ID";
    public static final String FIND_TERMINALS_BY_OUTLET_ID = "F_TERMS_BY_OUTLET_ID";
    public static final String FIND_TERMINALS_BY_BUSINESS_ID = "F_TERM_BY_BUS_ID";
    public static final String FIND_BUSINESSES_BY_FI_ID = "F_BUSINESSES_BY_FI_ID";

    public static final String FIND_CHAINS_BY_FI_ID = "F_CHAINS_BY_FI_ID";
    public static final String FIND_OUTLETS_BY_FI_ID = "F_OUTLETS_BY_FI_ID";


    // Way4 export entities permissions
    public static final String WAY4_EXPORT_ENTITY_LEVEL = "WAY4_EXPORT_ENTITY_LVL";

    // Fi Properties permissions
    public static final String CREATE_FI_PROPERTIES = "C_FI_PROP";
    public static final String UPDATE_FI_PROPERTIES = "U_FI_PROP";
    public static final String DELETE_FI_PROPERTIES = "D_FI_PROP";
    public static final String FIND_ALL_FI_PROPERTIES = "F_ALL_FI_PROP";
    public static final String FIND_FI_PROPERTIES_BY_ID = "F_FI_PROP_BY_ID";
    public static final String FIND_FI_PROPERTIES_BY_CRITERIA = "F_FI_PROP_BY_CRIT";

    // Fees-Profile permissions
    public static final String CREATE_FEES_PROFILE = "C_FEES_PROF";
    public static final String UPDATE_FEES_PROFILE = "U_FEES_PROF";
    public static final String DELETE_FEES_PROFILE = "D_FEES_PROF";
    public static final String FIND_ALL_FEES_PROFILE = "F_ALL_FEES_PROF";
    public static final String FIND_FEES_PROFILE_BY_ID = "F_FEES_PROF_BY_ID";
    public static final String FIND_FEES_PROFILE_BY_CRITERIA = "F_FEES_PROF_BY_CRIT";
}
